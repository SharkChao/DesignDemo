package com.winning.designdemo.factory.normal;

/**
 * 2018/12/5
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class GDComputerFactory extends ComputerFactory{
    @Override
    public <T extends Computer> T createComputer(Class<T> clazz) {
        String simpleName = clazz.getName();
        Computer computer = null;
        try {
            computer = (Computer) Class.forName(simpleName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
