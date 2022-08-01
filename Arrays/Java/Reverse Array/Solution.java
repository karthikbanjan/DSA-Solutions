import java.util.Scanner;

public class Solution {

    public static void reversed(int[] a, int n) {
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        reversed(a, n);
        System.out.print("Reversed Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}