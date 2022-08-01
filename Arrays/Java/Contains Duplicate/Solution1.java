import java.util.HashSet;
import java.util.Scanner;

public class Solution1 {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num: nums) {
            if (!numSet.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Does it contain a duplicate?: " + containsDuplicate(nums));
    }
}