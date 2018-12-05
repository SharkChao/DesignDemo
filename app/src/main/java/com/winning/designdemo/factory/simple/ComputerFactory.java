package com.winning.designdemo.factory.simple;

/**
 * 2018/12/5
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class ComputerFactory {
    public static Computer createComputer(String type){
        Computer computer = null;
        switch (type){
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "hp":
                computer = new HpComputer();
                break;
            case "dell":
                computer = new DellComputer();
                break;
        }
        return computer;
    }

}
