package demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"demo.controller","demo.config"})
//demo.config扫描config里的SpringMVCSupport
@EnableWebMvc
public class SpringmvcConfig {

}
