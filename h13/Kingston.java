package com.huawei.classroom.student.h13;

public class Kingston implements Memory {
    private String Name;
    private int volume;
    private double price;

    public Kingston(){
        this.Name = "Kingston";
        this.volume = 8;
        this.price = 1000;
    }

    @Override
    public void work() {
        System.out.println("Kingston Memory work");
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return Name;
    }
}
