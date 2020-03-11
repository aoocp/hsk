package com.huawei.classroom.student.h13;

public class Samsung implements Memory{
    private String Name;
    private int volume;
    private double price;

    public Samsung(){
        this.Name = "Samsung";
        this.volume = 4;
        this.price = 800;
    }

    @Override
    public void work() {
        System.out.println("Samsung Memory work");
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }
}
