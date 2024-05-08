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
@Import({MybatisConf.class,DataSourceConf.class})
//如果用了
//@Autowired
//DataSource dataSource;
//那么@Import必须加DataSourceConf.class
//反之如果在MybatisConf里添加的DatasourceBean对象就不需要
public class SpringConf {

}
