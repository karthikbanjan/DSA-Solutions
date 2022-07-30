import java.util.Scanner;

public class Solution1 {

    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        StringBuilder s2 = new StringBuilder();

        for (char value : c) {
            if (Character.isLetterOrDigit(value)) {
                s2.append(value);
            }
        }

        s2 = new StringBuilder(s2.toString().toLowerCase());

        for (int i = 0, j = s2.length() - 1; i <= j; i++, j--) {
            if (s2.charAt(i) != s2.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (isPalindrome(sc.nextLine())) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }
    }
}