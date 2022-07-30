import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCounter = new HashMap<>();
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            c = t.charAt(i);
            if (!charCounter.containsKey(c)) {
                return false;
            }

            if (charCounter.get(c) == 0) {
                return false;
            } else {
                charCounter.put(c, charCounter.get(c) - 1);
            }
        }

        return true;
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
