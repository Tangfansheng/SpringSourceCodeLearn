package com.ordo.entity.colors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Blue {


    @PostConstruct//创建对象之后
    public void init(){
        System.out.println("init........");
    }

    @PreDestroy//移除对象之前
    public void destroy(){
        System.out.println("destroy...");
    }
}
