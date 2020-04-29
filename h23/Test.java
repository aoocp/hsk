package com.huawei.classroom.student.h23;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        final int row = 1000;//列数
        final int col = 1000;//行数

        //随机生成两个row行col列的矩阵
        MatrixGenerator m1 = new MatrixGenerator(row,col);
        MatrixGenerator m2 = new MatrixGenerator(row,col);

        //用串行的方式实现矩阵乘法,并打印所用时间
        long startTime = System.currentTimeMillis();
        double [][] result1 = MatrixGenerator.mult(m1.getMatrix(),m2.getMatrix());
        long endTime = System.currentTimeMillis();
        System.out.println("串行时间："+(endTime-startTime));

        //row行那就用row个线程
        int threadNum = row;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        //初始化一个用于接收结果的矩阵
        double result2[][] = MatrixGenerator.getEmptyMatrix(row,col);

        //用多线程的方式实现矩阵乘法，并打印时间
        startTime = System.currentTimeMillis();
        for(int i = 0; i < threadNum;i++){
            MultThread1 tr = new MultThread1(m1,m2,result2,i,countDownLatch);
            tr.start();
        }
        countDownLatch.await();
        endTime = System.currentTimeMillis();
        System.out.println("并行时间："+(endTime-startTime));

        //检查结果是否一致
        System.out.println(MatrixGenerator.equal(result1,result2));
        System.out.println(result1.length + " " + result1[0].length);
        System.out.println(result2.length + " " + result2[0].length);
        /*MatrixGenerator.print(result1);
        System.out.println("--------------");
        MatrixGenerator.print(result2);*/
    }
}
