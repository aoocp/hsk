package com.huawei.classroom.student.h13;


public class Intel implements CPU{
    private String Name;
    private int coreNum;
    private double price;

    public Intel(){
        this.Name = "Intel";
        this.coreNum = 8;
        this.price = 3500;
    }

    @Override
    public void work() {
        System.out.println("Intel CPU work");
    }

    public double getPrice() {
        return price;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public String getName() {
        return Name;
    }
}