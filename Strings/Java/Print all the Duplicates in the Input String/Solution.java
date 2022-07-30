import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void printDuplicate(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Character key : charCount.keySet()) {
            if (charCount.get(key) > 1) {
                System.out.println(key + " " + charCount.get(key));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printDuplicate(s);
    }
}