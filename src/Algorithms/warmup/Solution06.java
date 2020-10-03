package Algorithms.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution06 {

    static void birthdayCakeCandles(int arr[]) {

        int max = arr[0];
        int cnt = 0;

        for (int i : arr) {
            if(max<i){
                max = i;
            }
        }

        for (int i : arr) {
            if (max == i) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        birthdayCakeCandles(arr);
    }
}