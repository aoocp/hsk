package com.huawei.classroom.student.h23;

import java.util.concurrent.CountDownLatch;

public class MultThread1 extends Thread {
    private MatrixGenerator matrix1;
    private MatrixGenerator matrix2;
    public CountDownLatch countDownLatch;
    private int index;
    private double [][] result;

    public MultThread1(MatrixGenerator m1, MatrixGenerator m2, double [][]result, int index, CountDownLatch countDownLatch){
        this.matrix1 = m1;
        this.matrix2 = m2;
        this.index = index;
        this.result = result;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        if(matrix1.getCol() != matrix2.getRow()){
            System.out.println("Cannot multiply them!");
        }
        else{
            for(int i = 0;i < matrix2.getCol();i++){
                for(int j = 0;j < matrix2.getRow();j++)
                    result[index][i] += matrix1.getVal(index,j)*matrix2.getVal(j,i);
            }
            countDownLatch.countDown();
        }
    }
}
