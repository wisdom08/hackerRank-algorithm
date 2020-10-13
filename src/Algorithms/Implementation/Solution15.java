package Algorithms.Implementation;

import java.util.Scanner;

//Apple and Orange
public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int apple = 0;
        int orange = 0;

        for (int i = 0; i < m; i++) {
            int landingSpot = sc.nextInt() + a;
            if (landingSpot >= s && landingSpot <= t) {
                apple++;
            }
        }

        for (int i = 0; i < n; i++) {
            int landingSpot = sc.nextInt() +b;
            if (landingSpot >=s && landingSpot <= t) {
                orange++;
            }
        }

        System.out.println(apple);
        System.out.println(orange);

    }
}
