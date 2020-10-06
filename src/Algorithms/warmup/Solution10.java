package Algorithms.warmup;

import java.util.Scanner;

//Compare the Triplets
public class Solution10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] aRate = new int[3];
        int[] bRate = new int[3];
        int[] result = new int[] {0, 0};


        for (int i = 0; i < aRate.length; i++) {
            aRate[i] = sc.nextInt();
        }
        for (int i = 0; i < bRate.length; i++) {
            bRate[i] = sc.nextInt();
        }

        for (int i = 0; i < aRate.length; i++) {
            if (aRate[i] > bRate[i]) {
                result[0]++;
            } else if (aRate[i] < bRate[i]) {
                result[1]++;
            } else {
            }
        }

        for (int i : result) {
            System.out.print(i+" ");
        }




    }
}