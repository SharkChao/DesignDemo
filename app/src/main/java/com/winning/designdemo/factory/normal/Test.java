package com.winning.designdemo.factory.normal;

/**
 * 2018/12/5
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class Test {
    public static void main(String[]args){
        GDComputerFactory computerFactory = new GDComputerFactory();
        HpComputer computer = computerFactory.createComputer(HpComputer.class);
        computer.start();

        Class clazz = String.class;
    }
}
