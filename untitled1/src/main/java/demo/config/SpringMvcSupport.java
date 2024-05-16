package demo.config;

import demo.controller.interceptor.MyInterceptor;
import demo.controller.interceptor.MyInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//在日常开发中推荐优先使用WebMvcConfigurer的方式（官方推荐），因为简单方便
// ，也没有特别复杂的定制需求；若我们项目中使用的MVC存在着更加复杂的配置需求推荐WebMvcConfigurationSupport，
// 通过继承此类，我们可以说对官方的MVC代码进行重写操作，但是因为其配置量较大，实现比较复杂，
// 因此在日常开发中使用WebMvcConfigurationSupport并不常见。

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
//    @Autowired
//    MyInterceptor interceptor;
//    @Autowired
//    MyInterceptor2 interceptor2;
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(interceptor2).addPathPatterns("/book/**");
//        registry.addInterceptor(interceptor).addPathPatterns("/book/**");
////        **代表包括book与book的子项
//    }

    //添加静态资源配置
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/hello.html").addResourceLocations("/hello.html");
    }
}
