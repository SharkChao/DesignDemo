package com.winning.designdemo.proxy.statics;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class ProxyShop implements IShop{
    private IShop mIShop;

    public ProxyShop(IShop IShop) {
        mIShop = IShop;
    }

    @Override
    public void buy() {
        mIShop.buy();
    }
}
