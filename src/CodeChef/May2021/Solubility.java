package CodeChef.May2021;

import java.util.Scanner;

public class Solubility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x, a, b;
            x = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println((a + (100 - x) * b) * 10);
        }
    }
}
