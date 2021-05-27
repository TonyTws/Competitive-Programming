package CodeChef.May2021;

import java.util.Scanner;

public class Golf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            n += 1;
            if (n == 0) {
                System.out.println("NO");
            }
            if (x % k == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
