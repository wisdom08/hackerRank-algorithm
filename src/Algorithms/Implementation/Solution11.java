package Algorithms.Implementation;

import java.util.Scanner;

//breaking-best-and-worst-records
public class Solution11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();

        int[] score = new int[gameNumber];

        for (int i = 0; i < gameNumber; i++) {
            score[i] = sc.nextInt();
        }

        int h = score[0];
        int l = score[0];
        int [] result = new int[2];

        for (int i = 0; i < gameNumber-1; i++) {
           if(score[i+1]>h){
               h = score[i + 1];
               result[1]++;
           } else if (score[i + 1] < l) {
               l = score[i + 1];
               result[0]++;
           }
        }
        System.out.println(result[1]+" "+result[0]);
    }
}
