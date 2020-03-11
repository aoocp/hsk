package com.huawei.classroom.student.h13;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Harddisk harddisk;
    private Mainboard mainboard;

    public Computer(CPU cpu,Memory memory,Harddisk harddisk,Mainboard mainboard){
        this.cpu = cpu;
        this.harddisk = harddisk;
        this.mainboard = mainboard;
        this.memory = memory;
    }

    public void work(){
        System.out.println("Computer work");
        cpu.work();
        memory.work();
        harddisk.work();
        mainboard.work();
    }

    public String getCPU() {
        return cpu.getName();
    }

    public String getMemory(){
        return memory.getName();
    }

    public String getHardDisk(){
        return harddisk.getName();
    }

    public String getMainboard(){
        return mainboard.getName();
    }

    public double getPrice(){
        return cpu.getPrice() + memory.getPrice() + mainboard.getPrice() + harddisk.getPrice();
    }
}
