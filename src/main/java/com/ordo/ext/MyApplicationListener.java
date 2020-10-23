package com.ordo.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    //当容器中发布事件时会触发
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到事件: " + event);
    }
}
