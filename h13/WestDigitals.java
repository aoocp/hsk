package com.huawei.classroom.student.h13;

public class WestDigitals implements Harddisk{
    private String Name;
    private int volume;
    private double price;

    @Override
    public void work() {
        System.out.println("WestDigitals hard disk work");
    }

    public WestDigitals(){
        this.Name = "WestDigitals";
        this.volume = 1024;
        this.price = 600;
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
