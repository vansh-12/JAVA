import java.util.*;

public class merge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // Read the size of the array
        int a[] = new int[s]; // Initialize the array
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt(); // Read the elements of the array
        }

        Merge_Divide(a, 0, s - 1); // Sort the array
        System.out.println(Arrays.toString(a)); // Print the sorted array
    }

    public static void Merge_Divide(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            Merge_Divide(a, p, q);
            Merge_Divide(a, q + 1, r);
            merging(a, p, q, r);
        }
    }

    public static void merging(int[] a, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            L[i] = a[p + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = a[q + i + 1];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i = i + 1;
            } else {
                a[k] = R[j];
                j = j + 1;
            }
        }
    }
}
