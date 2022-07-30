import java.util.HashSet;
import java.util.Scanner;

public class Solution2 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        int i = 0, j = 0, max = 0;
        HashSet<Character> subSet = new HashSet<>();

        while (j < s.length()) {
            while (subSet.contains(s.charAt(j))) {
                subSet.remove(s.charAt(i));
                i++;
            }

            subSet.add(s.charAt(j));
            j++;
            max = Math.max(max, j - i);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("Length of Longest Substring without Repeating Characters: " + lengthOfLongestSubstring(s));
    }
}
