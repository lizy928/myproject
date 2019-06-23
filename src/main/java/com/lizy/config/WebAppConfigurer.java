package com.lizy.config;

import com.lizy.intercepter.spring.ParamIntercepter;
import com.lizy.intercepter.spring.UserLoginIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * springMVC配置
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 可添加多个
        registry.addInterceptor(new ParamIntercepter()).addPathPatterns("/**");

        registry.addInterceptor(new UserLoginIntercepter()).addPathPatterns("/**");
    }

}
