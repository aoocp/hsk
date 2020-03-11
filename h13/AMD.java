package com.huawei.classroom.student.h13;

public class AMD implements CPU{
    private String Name;
    private int coreNum;
    private double price;

    public AMD() {
        this.Name = "AMD";
        this.coreNum = 8;
        this.price = 2800;
    }

    @Override
    public void work() {
        System.out.println("AMD CPU work");
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