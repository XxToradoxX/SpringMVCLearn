package demo.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
//首先可以看出，AbstractAnnotationConfigDispatcherServletInitializer是一个抽象类，且继承了AbstractDispatcherServletInitializer类。它还有一个无参的构造方法。
//其次它里面有方法可以返回WebApplicationContext的对象。所以说，实现这个类，反过来会查找实现WebApplicationContext的类并将配置的任务交给他们来完成。
//其中方法createRootApplicationContext和createServletApplicationContext都是用来创建程序的引用上下文，只不过一个是Root的一个是servlet的。对于获取到的配置类型信息数组做出判断，如果不为null,则调用AnnotationConfigWebApplicationContext类的register方法进行注册。
//其中getServletConfigClasses()方法返回带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean。getRootConfigClasses()方法返回带有@Configuration注解的类将会用来配置ContextClassLoaderListener创建的应用的上下文。
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringmvcConfig.class);
        return context;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
