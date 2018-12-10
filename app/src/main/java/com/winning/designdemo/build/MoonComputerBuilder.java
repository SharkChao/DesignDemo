package com.winning.designdemo.build;

/**
 * 2018/12/7
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class MoonComputerBuilder extends Builder{
    private Computer mComputer = new Computer();


    @Override
    public void buildCPU(String cpu) {
        mComputer.setCpu(cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        mComputer.setMainBoard(mainBoard);
    }

    @Override
    public void buildRam(String ram) {
        mComputer.setRam(ram);
    }

    @Override
    public Computer createComputer() {
        return mComputer;
    }
}
