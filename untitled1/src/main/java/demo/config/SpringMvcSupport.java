package demo.config;

import demo.controller.interceptor.MyInterceptor;
import demo.controller.interceptor.MyInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    MyInterceptor interceptor;
    @Autowired
    MyInterceptor2 interceptor2;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor2).addPathPatterns("/book/**");
        registry.addInterceptor(interceptor).addPathPatterns("/book/**");
//        **代表包括book与book的子
    }

}
