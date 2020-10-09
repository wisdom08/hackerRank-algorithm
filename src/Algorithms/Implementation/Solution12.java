package Algorithms.Implementation;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

//Cats and a Mouse
public class Solution12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < q; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            int distanceA = Math.abs(a - c);
            int distanceB = Math.abs(b - c);

            if (distanceA > distanceB) {
                System.out.println("Cat B");
            } else if (distanceA < distanceB) {
                System.out.println("Cat A");
            } else {
                System.out.println("Mouse C");
            }

        }

    }
}
