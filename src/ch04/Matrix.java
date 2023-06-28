package ch04;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // 다차원 배열

        // 2차원 배열 초기화
        // [행][열]
        int[][] matrix = new int[3][4];

        matrix[0][0] = 1;
        matrix[2][3] = 4;

        for (int i=0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i + j;
            }


        }




        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        for (int i=0; i < num.length; i++) {
            System.out.println(num[i]);
        }




    }
}
