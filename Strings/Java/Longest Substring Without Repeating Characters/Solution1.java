import java.util.Scanner;

public class Solution1 {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        String sub = "";

        int max = 0, i = 0, j = 0;

        while (i <= j && j < n) {
            if (sub.contains("" + s.charAt(j))) {
                i++;
            }

            sub = s.substring(i, j + 1);

            if (j+1 != n && !sub.contains("" + s.charAt(j + 1))) {
                j++;
            } else if (i == j) {
                j++;
            }

            max = Math.max(max, sub.length());
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("Length of Longest Substring without Repeating Characters: " + lengthOfLongestSubstring(s));
    }
}