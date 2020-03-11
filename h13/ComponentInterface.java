package com.huawei.classroom.student.h13;

public interface ComponentInterface {
}

interface CPU {
    void work();
    String getName();
    int getCoreNum();
    double getPrice();
}

interface Memory{
    void work();
    String getName();
    double getPrice();
    int getVolume();
}

interface Harddisk{
    void work();
    String getName();
    double getPrice();
    int getVolume();
}

interface Mainboard{
    void work();
    String getSpeed();
    double getPrice();
    String getName();
}