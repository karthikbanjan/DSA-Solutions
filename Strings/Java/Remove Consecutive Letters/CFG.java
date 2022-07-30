import java.io.*;

//Driver code by GeeksForGeeks
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String S = read.readLine().trim();

            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);

            System.out.println(ans);
        }
    }
}

class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuilder sn = new StringBuilder("" + S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                sn.append(S.charAt(i));
            }
        }

        return sn.toString();
    }
}