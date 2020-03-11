package com.huawei.classroom.student.h13;

public class ASus implements Mainboard {
    private String Name;
    private String speed;
    private double price;

    @Override
    public void work() {
        System.out.println("ASus mainboard work");
    }

    public ASus(){
        this.Name = "ASus";
        this.speed = "3600mhz";
        this.price = 800;
    }

    public String getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return Name;
    }
}
