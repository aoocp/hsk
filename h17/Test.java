package com.huawei.classroom.student.h17;

public class Test {
    public static void main(String[] args)
    {
        String srcPathStr = "D:\\a大二下\\JAVA进阶\\Java进阶实验报告.md"; //源文件地址
        String desPathStr = "D:\\a大二下\\JAVA进阶\\homework4"; //目标文件地址
        CopyFile.copy(srcPathStr, desPathStr);
    }
}
