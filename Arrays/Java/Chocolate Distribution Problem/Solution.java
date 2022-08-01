import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        long minDiff = Long.MAX_VALUE;
        long diff;

        for (int i = 0; i+m-1 < n; i++) {
            diff = a.get(i+m-1) - a.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> packets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            packets.add(sc.nextInt());
        }

        System.out.println("Minimum Difference: " + findMinDiff(packets, n, m));
    }
}