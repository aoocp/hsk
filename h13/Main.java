package com.huawei.classroom.student.h13;

public class Main {
    public static void main (String args[]){
        Computer computer1 = new Computer(new Intel(),new Samsung(),new Seagate(),new Gigabyte());
        Computer computer2 = new Computer(new AMD(),new Kingston(),new Seagate(),new ASus());
        Computer computer3 = new Computer(new AMD(),new Samsung(),new WestDigitals(),new Gigabyte());

        ComputerStore store = new ComputerStore();
        store.AddComputer(computer1);
        store.AddComputer(computer2);
        store.AddComputer(computer3);
        store.ShowComputerList();

        computer1.work();
        computer2.work();
        computer3.work();
    }
}
