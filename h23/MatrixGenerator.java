package com.huawei.classroom.student.h23;

        import java.util.Random;

public class MatrixGenerator {
    private int row;
    private int col;
    private double[][] matrix;

    public MatrixGenerator(int row,int col){
        this.row = row;
        this.col = col;
        matrix = new double[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                Random r = new Random();
                double num = r.nextInt(5)+1;
                matrix[i][j] = num;
            }
        }
    }

    //矩阵乘法
    public static double[][] mult(double [][]a,double[][]b){
        int rowA=a.length;
        int rowB=b.length;
        int columnA=a[0].length;
        int columnB=b[0].length;
        if(columnA!=rowB){
            System.out.println("Cannot multiply them!");
            return a;
        }
        double[][] c=new double[rowA][columnB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < columnA; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
        return c;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public double getVal(int row,int col){
        return matrix[row][col];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public static double[][] getEmptyMatrix(int row,int col){
        double [][] a = new double[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++)
                a[i][j] = 0;
        }
        return a;
    }

    public static boolean equal(double[][] a,double[][] b){
        boolean flag = true;
        if(a.length == b.length&& a[0].length==b[0].length){
            for(int i = 0; i < a.length;i++){
                for(int j = 0;j < a[0].length;j++){
                    if(!(a[i][j]==b[i][j]))
                        flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void print(double[][] a){
        for(int i = 0; i < a.length;i++){
            for(int j = 0;j < a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
