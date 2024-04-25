package demo.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

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

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
