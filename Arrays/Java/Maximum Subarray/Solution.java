import java.util.Scanner;

public class Solution {

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num: nums) {
            sum = Math.max(num, sum + num);
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Maximum SubArray Sum: " + maxSubArray(nums));
    }
}