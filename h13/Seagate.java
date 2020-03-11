package com.huawei.classroom.student.h13;

public class Seagate implements Harddisk{
    private String Name;
    private int volume;
    private double price;

    public Seagate(){
        this.Name = "Seagate";
        this.volume = 1024;
        this.price = 500;
    }

    @Override
    public void work() {
        System.out.println("Seagate hard disk work");
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

