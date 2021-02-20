package com.example.dummy.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class DummyInterceptorRegistry extends WebMvcConfigurerAdapter
{
    @Autowired
    DummyInterceptor dummyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(dummyInterceptor);
    }
}
