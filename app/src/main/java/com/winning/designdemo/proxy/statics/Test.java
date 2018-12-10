package com.winning.designdemo.proxy.statics;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class Test {
    public static void main(String[]args){
        ProxyShop proxyShop = new ProxyShop(new SCShop());
        proxyShop.buy();
    }
}
