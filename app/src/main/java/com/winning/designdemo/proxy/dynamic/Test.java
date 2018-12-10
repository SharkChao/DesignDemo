package com.winning.designdemo.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class Test {
    public static void main(String[]args){
        IShop scShop = new SCShop();
        IShop proxy = (IShop) Proxy.newProxyInstance(scShop.getClass().getClassLoader(), new Class[]{IShop.class}, new DynamicProxy(scShop));
        proxy.buy();
    }
}
