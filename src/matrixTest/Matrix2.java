package matrixTest;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("n x n 행렬을 출력합니다. n을 입력하시오.");
        int n=0;

        Matrix2View mx=new Matrix2View();

        System.out.print("n: ");
        mx.setN(sc.nextInt());
        n=mx.getN();

        mx.createMatrix(n);

        int[][] matrix=mx.getMatrix();
        mx.printMatrix(matrix);


    }
}
