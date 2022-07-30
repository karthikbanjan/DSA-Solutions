import java.util.Arrays;
import java.util.Scanner;

class Solution1 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        return Arrays.equals(sc, tc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isAnagram(s, t)) {
            System.out.println("It is an Anagram.");
        } else {
            System.out.println("It is not a not Anagram.");
        }
    }
}