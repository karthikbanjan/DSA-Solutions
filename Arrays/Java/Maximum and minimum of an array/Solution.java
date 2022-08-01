import java.util.Scanner;

public class Solution {

    static class Pair {
        int min;
        int max;

        public Pair() {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
    }

    public static Pair getMinMax(int[] a, int n) {
        Pair minmax = new Pair();
        for (int i = 0; i < n; i++) {
            if (a[i] > minmax.max) {
                minmax.max = a[i];
            }

            if (a[i] < minmax.min) {
                minmax.min = a[i];
            }
        }

        return minmax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Pair minmax = getMinMax(a, n);

        System.out.println("Minimum Value: " + minmax.min);
        System.out.println("Maximum Value: " + minmax.max);
    }
}