package Algorithms.Implementation;

import java.util.Scanner;

//The Hurdle Race
public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();

            if (height > max) {
                max = height;
            }
        }


        int result = max - k;

        if(result > 0){
            System.out.println(result);
        } else {
            System.out.println("0");
        }

    }
}
