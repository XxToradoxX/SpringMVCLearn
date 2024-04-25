package demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {//获取spring容器配置
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//springmvc容器的配置
        return new Class[]{SpringmvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {//获取springmvc拦截路径
        return new String[]{"/"};
    }
}
