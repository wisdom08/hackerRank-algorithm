package Algorithms.Implementation;

import java.util.Scanner;

//Divisible Sum Pairs
public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int cnt =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i] + arr[j]) % k == 0) {
                   cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
