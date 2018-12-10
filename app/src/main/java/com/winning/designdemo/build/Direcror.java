package com.winning.designdemo.build;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class Direcror {

    private Builder mBuilder;
    public Direcror(Builder builder){
        mBuilder = builder;
    }
    public Computer createComputer(String cpu,String mainBoard,String ram){
        mBuilder.buildCPU(cpu);
        mBuilder.buildMainBoard(mainBoard);
        mBuilder.buildRam(ram);
        return  mBuilder.createComputer();
    }
}
