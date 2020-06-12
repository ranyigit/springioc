package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Bean 作用：用于把当前方法的返回值作为bean对象存入spring的IOC容器中
 * 属性 name 用于指定bean的id，当不写时，默认值是当前方法的名称
 *
 * Import 作用： 用于导入其他的配置类
 * 属性：value 用于指定其他配置类的字节码
 * 当我们使用Import的注解之后，有Import注解的类就是父配置类，而导入的类就是子配置类
 *
 * Properties 作用：用于指定properties文件的位置
 * 属性： value 指定文件的名称和路径
 * 关键字 classpath 表示类路径下
 */
//@Configuration
@ComponentScan({"com.tv189"}) //@ComponentScan({"com.tv189","config"}) 不加扫描包就需要加@Import注解
@Import({JdbcConfig.class})
@PropertySource("classpath:JdbcConfig.properties")
public class SpringConfiguration {

}
