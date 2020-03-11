package com.huawei.classroom.student.h13;

import java.util.*;

public class ComputerStore {
    private List<Computer> ComputerList= new ArrayList<Computer>();

    public void AddComputer(Computer c){
        ComputerList.add(c);
    }

    public void ShowComputerList(){
        for(int i = 0; i < ComputerList.size();i++){
            System.out.println("第" + (i+1) + "台电脑：");
            System.out.println("CPU:" + ComputerList.get(i).getCPU());
            System.out.println("Memory:" + ComputerList.get(i).getMemory());
            System.out.println("Hard Disk:" + ComputerList.get(i).getHardDisk());
            System.out.println("Mainboard:"+ ComputerList.get(i).getMainboard());
            System.out.println("价格：" + ComputerList.get(i).getPrice());
        }
    }

}

