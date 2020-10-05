package Algorithms.warmup;

import java.util.Scanner;

//Time Conversion
public class Solution09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(input.contains("AM")){
            amTo24(input);
        } else {
            pmTo24(input);
        }

    }

    private static void pmTo24(String input) {

        String s1 = input.substring(0, 8);
        String s2 = input.substring(3, 8);
        String beforeHour = s1.substring(0, 2);
        int afterHour = Integer.parseInt(beforeHour);

        if (s1.contains("12")) {
            System.out.println(s1);
        } else {
            afterHour+=12;
            String ss = Integer.toString(afterHour);
            String result = ss.concat(":"+s2);
            System.out.println(result);
        }

    }

    private static void amTo24(String input) {
        String s1 = input.substring(0, 8);
        String s2 = input.substring(3, 8);
        String beforeHour = s1.substring(0, 2);
        int afterHour = Integer.parseInt(beforeHour);

        if (s1.contains("12")) {
            afterHour-=12;
            String ss = Integer.toString(afterHour);
            String result = "0".concat(ss+":"+s2);
            System.out.println(result);

        } else {
            System.out.println(s1);
        }
    }
}