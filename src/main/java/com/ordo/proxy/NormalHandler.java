package com.ordo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NormalHandler implements InvocationHandler {
    private IPerson target;


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy success");
        return  method.invoke(target, args);
    }

    public Object getInstance(IPerson object){
        this.target = object;
        Class clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }




}
