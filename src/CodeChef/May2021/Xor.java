package CodeChef.May2021;


import java.util.Scanner;

public class Xor {

    public static void main(String[] args) {
        final long MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();

            for (long i = 0; i < Math.pow(2, n) + 1; i++) {
                long x = i ^ (i + 1);
                long y = (i + 2) ^ (i + 3);
                if (x == y) {
                    System.out.println(i % MOD);
                }
            }
        }
    }
}
