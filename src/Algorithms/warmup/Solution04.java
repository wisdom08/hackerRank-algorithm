package Algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution04 {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float positive = 0;
        float negative = 0;
        float zero = 0;
        float total = 0;
        for (int i : arr) {
            if(i>0){
                positive++;
            } else if(i<0){
                negative++;
            } else {
                zero ++;
            }
            total ++;
        }



        System.out.printf("%1.6f\n", positive/total);
        System.out.printf("%1.6f\n", negative/total);
        System.out.printf("%1.6f\n", zero/total);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}