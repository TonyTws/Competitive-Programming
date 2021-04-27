package CodeMonk.ArraysStrings;

import CustomClasses.FastReader;

public class MonkAndRotation {
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

//            if (n != 0) {
//                k %= n;
//
//                reverse(arr, 0, n - 1);
//                reverse(arr, 0, k - 1);
//                reverse(arr, k, n - 1);
//
//                print(arr);
//                System.out.println();
//            }

            k %= n;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[(i + (n - k)) % n] + " ");
            }
        }
    }

    private static void reverse(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
        reverse(nums, start + 1, end - 1);
    }

    private static void print(int[] nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}
