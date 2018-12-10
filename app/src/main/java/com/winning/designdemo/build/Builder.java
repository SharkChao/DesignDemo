package com.winning.designdemo.build;

/**
 * 2018/12/6
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public abstract class Builder {
    public abstract void buildCPU(String cpu);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildRam(String ram);
    public abstract Computer createComputer();
}
