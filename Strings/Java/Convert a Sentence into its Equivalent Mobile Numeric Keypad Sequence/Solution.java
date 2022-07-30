import java.util.Map;
import java.util.Scanner;
import static java.util.Map.entry;

public class Solution {

    static Map<Character, Integer> keypad = Map.ofEntries(
            entry('a',2), entry('b', 22), entry('c', 222), entry('d', 3), entry('e', 33),
            entry('f',333), entry('g',4), entry('h',44), entry('i',444), entry('j',5),
            entry('k',55), entry('l',555), entry('m',6), entry('n',66), entry('o',666),
            entry('p',7), entry('q',77), entry('r',777), entry('s',7777), entry('t',8),
            entry('u',88), entry('v',888), entry('w',9), entry('x',99), entry('y',999),
            entry('z',9999), entry(' ', 0)
    );

    public static String keypadSequence(String s) {
        StringBuilder sf = new StringBuilder();
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '*') {
                sf.append("*");
            } else if (c == '#') {
                sf.append("#");
            } else if (Character.isDigit(c)){
                sf.append(c);
            } else if (c >= 'a' && c <= 'z' || c == ' '){
                sf.append(keypad.get(c));
            } else {
                return "Invalid Character found, exiting!";
            }
        }

        return sf.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = keypadSequence(s.toLowerCase());
        System.out.println(s);
    }
}
