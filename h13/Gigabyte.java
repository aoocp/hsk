package com.huawei.classroom.student.h13;

public class Gigabyte implements Mainboard{
    private String Nmae;
    private String speed;
    private double price;

    @Override
    public void work() {
        System.out.println("Gigabyte Mainboard work");
    }

    public Gigabyte(){
        this.Nmae = "Gigabyte";
        this.speed = "3600mhz";
        this.price = 900;
    }

    public double getPrice() {
        return price;
    }

    public String getSpeed() {
        return speed;
    }

    public String getName() {
        return Nmae;
    }
}
