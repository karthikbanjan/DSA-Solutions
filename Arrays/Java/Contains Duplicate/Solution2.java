import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int num: nums) {
            if (numMap.containsKey(num)) {
                return true;
            } else {
                numMap.put(num, 1);
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