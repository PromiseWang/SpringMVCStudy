package org.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Author: Promise
 * Date: 2024-03-01 18:26
 * Description:
 * Spring MVC提供的接口, 是替代web.xml的方案, 更方便实现完全注解方式ssm处理
 * Spring MVC框架会自动检查当前实现类, 会自动加载getRootConfigClasses() / getServletConfigClasses().
 * getServletMappings 返回的地址 设置DispatcherServlet对应处理的地址
 */

public class SpringMVCInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 指定service / mapper 层的配置类
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    /**
     * 指定Spring MVC 的配置类
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MVCConfig.class};
    }

    /**
     * 设置DispatcherServlet处理路径
     * 一般情况下为 / 代表处理所有请求
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

// 该类等效了以下内容
// <web-app>
//
//	<listener>
//		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
//	</listener>
//
//
//	<servlet>
//		<servlet-name>app1</servlet-name>
//		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//		<init-param>
//			<param-name>contextConfigLocation</param-name>
//			<param-value>/WEB-INF/web.xml</param-value>
//		</init-param>
//		<load-on-startup>1</load-on-startup>
//	</servlet>
//
//	<servlet-mapping>
//		<servlet-name>app1</servlet-name>
//		<url-pattern>/</url-pattern>
//	</servlet-mapping>
//
//</web-app>