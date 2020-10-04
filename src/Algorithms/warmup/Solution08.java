package Algorithms.warmup;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//mini-max-sum
public class Solution08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long [] arr = new long[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        sum(arr,arr[0],arr[4]);
    }

    private static void sum(long[] arr, long min, long max) {
        long sum = 0;

        for (long l : arr) {
            sum+=l;
        }

        long minSum = sum-max;
        long maxSum = sum-min;

        System.out.print(minSum+" "+maxSum);
    }
}