package CodeForces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int no = n * 3;
        int ans = 0;
        while (no > 0) {
            int j = 0;
            for (int i = 0; i < 3; i++) {
                int num = sc.nextInt();
                if (num == 1)
                    j += 1;
            }
            if (j >= 2)
                ans += 1;
            no -= 3;
        }
        System.out.println(ans);
    }
}
