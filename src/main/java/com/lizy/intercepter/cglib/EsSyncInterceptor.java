package com.lizy.intercepter.cglib;

import com.lizy.annotion.UseCase;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class EsSyncInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy){
        Annotation annotation = method.getAnnotation(UseCase.class);
        if(annotation != null){
            System.out.println("拦截到了注解");
        }
        return null;
    }
}
