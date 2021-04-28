package CodeForces;

import java.util.Scanner;

public class CossackAndContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        if (n <= m && n <= k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

