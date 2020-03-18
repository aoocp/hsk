#  Java进阶实验报告





### 一、实验要求



###### 1.需求描述

某计算机组装公司主要销售各类组装计算机，计算机一般由CPU、内存、主板、硬盘等组件构成。具体组件信息如下：

 

| 组件名 | 组件品牌              | 组件属性             |
| ------ | --------------------- | -------------------- |
| CPU    | Intel、AMD            | Name，coreNum，price |
| 内存   | Samsung, Kingston     | Name, volume, price  |
| 硬盘   | Seagate, WestDigitals | Name, volume, price  |
| 主板   | Asus、Gigabyte        | Name，speed, price   |

每个组件都有自己的工作方式，简单起见，每个组件的工作内容为打印“组件名+work”。



######  2. 实现功能

* 每个组件的每个品牌，设计一个类，并画成整体的类图    
* 设计计算机类（Computer.java），由上述四类组件组装而成，包括计算机的名称、计算机的描述（包括各个组件名）以及总价格等
* 设计计算机销售主类（ComputerStore.java），包括3个由不同组件组装在一起的计算机实例，可实现计算机商品一览表，可展示每台计算机的描述、价格、工作等。
* 设计时基于抽象类和接口，要尽可能的实现高内聚、低耦合





###  二、类图

![未命名文件 (15)](D:\Downloads1\未命名文件 (15).png)



###  三、源代码

接口类

```java
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
```

对每个组件设计一个类

```java
package com.huawei.classroom.student.h13;


public class Intel implements CPU{
    private String Name;
    private int coreNum;
    private double price;

    public Intel(){
        this.Name = "Intel";
        this.coreNum = 8;
        this.price = 3500;
    }

    @Override
    public void work() {
        System.out.println("Intel CPU work");
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
```



```java
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
```



```java
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

```



```java
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

```



```java
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
```



```java
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

```



```java
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
```



```java
package com.huawei.classroom.student.h13;

import java.util.*;

public class ComputerStore {
    private List<Computer> ComputerList= new ArrayList<Computer>();

    public void AddComputer(Computer c){
        ComputerList.add(c);
    }

    public void ShowComputerList(){
        for(int i = 0; i < ComputerList.size();i++){
            System.out.println("第" + i + "台电脑：");
            System.out.println("CPU:" + ComputerList.get(i).getCPU());
            System.out.println("Memory:" + ComputerList.get(i).getMemory());
            System.out.println("Hard Disk:" + ComputerList.get(i).getHardDisk());
            System.out.println("Mainboard:"+ ComputerList.get(i).getMainboard());
            System.out.println("价格：" + ComputerList.get(i).getPrice());
        }
    }

}
```



Computer类

```java
package com.huawei.classroom.student.h13;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Harddisk harddisk;
    private Mainboard mainboard;

    public Computer(CPU cpu,Memory memory,Harddisk harddisk,Mainboard mainboard){
        this.cpu = cpu;
        this.harddisk = harddisk;
        this.mainboard = mainboard;
        this.memory = memory;
    }

    public void work(){
        System.out.println("Computer work");
        cpu.work();
        memory.work();
        harddisk.work();
        mainboard.work();
    }

    public String getCPU() {
        return cpu.getName();
    }

    public String getMemory(){
        return memory.getName();
    }

    public String getHardDisk(){
        return harddisk.getName();
    }

    public String getMainboard(){
        return mainboard.getName();
    }

    public double getPrice(){
        return cpu.getPrice() + memory.getPrice() + mainboard.getPrice() + harddisk.getPrice();
    }
}
```



ComputerStore类

```java
package com.huawei.classroom.student.h13;

import java.util.*;

public class ComputerStore {
    private List<Computer> ComputerList= new ArrayList<Computer>();

    public void AddComputer(Computer c){
        ComputerList.add(c);
    }

    public void ShowComputerList(){
        for(int i = 0; i < ComputerList.size();i++){
            System.out.println("第" + i + "台电脑：");
            System.out.println("CPU:" + ComputerList.get(i).getCPU());
            System.out.println("Memory:" + ComputerList.get(i).getMemory());
            System.out.println("Hard Disk:" + ComputerList.get(i).getHardDisk());
            System.out.println("Mainboard:"+ ComputerList.get(i).getMainboard());
            System.out.println("价格：" + ComputerList.get(i).getPrice());
        }
    }

}
```



测试主类

```java
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
```



###  四、测试结果

![1583837720171](C:\Users\AOOCP\AppData\Roaming\Typora\typora-user-images\1583837720171.png)

