import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Solution {

    public static boolean isValid(String s) {
        char[] c = s.toCharArray();

        Deque<Character> brackets = new ArrayDeque<>();

        for (char value : c) {
            if (value == '{' || value == '[' || value == '(') {
                brackets.push(value);
            } else if (brackets.isEmpty()) {
                return false;
            } else if (value == '}' && brackets.peekFirst() == '{') {
                brackets.pop();
            } else if (value == ']' && brackets.peekFirst() == '[') {
                brackets.pop();
            } else if (value == ')' && brackets.peekFirst() == '(') {
                brackets.pop();
            } else if (value == '}' || value == ']' || value == ')'){
                brackets.push(value);
            }
        }

        return brackets.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isValid(s)) {
            System.out.println("Valid Parenthesis.");
        } else {
            System.out.println("Invalid Parenthesis.");
        }
    }
}