package com.winning.designdemo.proxy.statics;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class SCShop implements IShop{
    @Override
    public void buy() {
        System.out.println("思聪买东西");
    }
}
