package com.winning.designdemo.build;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class Test {
    public static void main(String[]args){

        Direcror direcror = new Direcror(new MoonComputerBuilder());
        direcror.createComputer("cpu","mainboard","ram");
    }
}
