package Algorithms.warmup;

import java.util.Scanner;

public class Solution07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];


        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int row=0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = sc.nextInt();

                if(row == col){
                    firstDiagonal += arr[row][col];
                }

                if(row-col==n || col-row==n || row+col+1==n){
                    secondDiagonal += arr[row][col];
                }

            }
        }

                int abs = Math.abs(firstDiagonal - secondDiagonal);
                 System.out.println(abs);
    }
}