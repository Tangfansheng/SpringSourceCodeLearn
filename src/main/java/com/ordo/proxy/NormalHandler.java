package com.ordo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NormalHandler implements InvocationHandler {
    private Object target;

    public NormalHandler(Object obj){
        this.target = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target, args);
        return null;
    }
}
