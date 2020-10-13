package Algorithms.Implementation;

import java.util.Scanner;

//Bill Division
public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int charged = 0;
        int actual = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int input = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[k]){
                continue;
            }
            sum += arr[i];
        }

        charged = (sum+arr[k])/2;
        actual = sum/2;

        if (input != actual) {
            System.out.println(charged - actual);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
