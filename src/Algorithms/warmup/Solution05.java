package Algorithms.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution05 {

    // Complete the staircase function below.
    static void staircase(int n) {

        int cnt = 0;

        for (int i=0; i<n; i++) {

            cnt += 1;

            for (int j=0; j<n-cnt; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < cnt; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
