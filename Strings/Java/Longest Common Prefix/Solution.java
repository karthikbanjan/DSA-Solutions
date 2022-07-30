import java.util.Scanner;

class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        StringBuilder s = new StringBuilder();
        char c;

        for (int i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                try {
                    if (strs[j].charAt(i) != c) {
                        return s.toString();
                    }
                } catch (StringIndexOutOfBoundsException m) {
                    return s.toString();
                }

            }

            s.append(c);
        }

        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];

        while (n > 0) {
            strs[n - 1] = sc.next();
            n--;
        }
        System.out.println(longestCommonPrefix(strs));
    }
}