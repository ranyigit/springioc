package com.tv189.test;

import com.tv189.domain.Account;
import com.tv189.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit测试单元，测试配置
 *
 * Spring整合junit的配置
 *      1、导入spring整合junit的jar包 spring-test
 *      2、使用junit提供的一个注解把原有的main方法替换了，替换成spring提供的
 *      3、告知spring的运行期，spring和IOC创建是基于xml还是注解的，并且说明位置
 * @ContextConfiguration
 *      location:指定xml文件的位置，加上classpath关键字，表示在类路径下
 *      classes:指定注解类所在的位置
 * 当我们使用 spring 5.* 版本的时候，要求junit的jar版本必须是4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class) //@ContextConfiguration(location = "classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    private IAccountService as;

    @Test
    public void findAllAccount() {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //IAccountService as = applicationContext.getBean("accountService", IAccountService.class);

        List<Account> accounts = as.findAllAccount();

        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testSave() {

        Account account = new Account();
        account.setName("Rory");
        account.setMoney(12345f);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = applicationContext.getBean("accountService", IAccountService.class);
        as.saveAccount(account);
        System.out.println(account);
    }
}
