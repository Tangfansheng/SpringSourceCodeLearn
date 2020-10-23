package com.ordo.bean;


import com.ordo.entity.colors.Blue;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import javax.xml.ws.RequestWrapper;

public class Person {
    private String name;
    private int age;

    private Blue blue;

    public Person(String momo, int i) {
        this.name = momo;
        this.age = i;
    }

    public Person (Blue blue){
        this.blue = blue;
        System.out.println("依赖注入完毕");
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
