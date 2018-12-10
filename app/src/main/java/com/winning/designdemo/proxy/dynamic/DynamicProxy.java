package com.winning.designdemo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class DynamicProxy implements InvocationHandler {

    private Object mObject;

    public DynamicProxy(Object object) {
        mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理之前");
        Object result = method.invoke(mObject, args);
        System.out.println("代理之后");
        return result;
    }
}
