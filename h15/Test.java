package com.huawei.classroom.student.h15;

import java.io.*;

public class Test {
    public static final String filename = "D:\\nmysl\\src\\com\\huawei\\classroom\\student\\h15\\了不起的盖茨比英文.txt";
    public static void main(String[] args) throws Exception {
        Analysis analysis = new Analysis();
        analysis.getStringFrequent(filename);
    }
}
