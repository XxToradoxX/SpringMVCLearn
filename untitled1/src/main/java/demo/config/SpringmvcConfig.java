package demo.config;

import demo.controller.interceptor.MyInterceptor;
import demo.controller.interceptor.MyInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = {"demo.controller", "demo.config"})
//demo.config扫描config里的SpringMVCSupport
@EnableWebMvc
public class SpringmvcConfig implements WebMvcConfigurer {
    @Autowired
    MyInterceptor interceptor;
    @Autowired
    MyInterceptor2 interceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor2).addPathPatterns("/book/**");
        registry.addInterceptor(interceptor).addPathPatterns("/book/**");
    }
}
