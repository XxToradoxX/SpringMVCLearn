package demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"demo.service", "demo.controller"})
@Import({MybatisConf.class,DataSourceConf.class, SpringmvcConfig.class})
//@Import可以把Class对象转化为bean注册到当前对象里
public class SpringConf {

}
