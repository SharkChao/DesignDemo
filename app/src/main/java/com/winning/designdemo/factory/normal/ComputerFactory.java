package com.winning.designdemo.factory.normal;

/**
 * 2018/12/5
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clazz);
}
