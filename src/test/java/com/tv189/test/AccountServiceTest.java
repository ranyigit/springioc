package com.tv189.test;

import com.tv189.domain.Account;
import com.tv189.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用Junit测试单元，测试配置
 */
public class AccountServiceTest {

    @Test
    public void findAllAccount() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = applicationContext.getBean("accountService", IAccountService.class);
        Account account = as.findAllById(1);
        System.out.println(account);
    }
}
