import java.util.*;

public class insertion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // Read the size of the array
        int a[] = new int[s]; // Initialize the array
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt(); // Read the elements of the array
        }
        Insertion(a, s); // Sort the array
        System.out.println(Arrays.toString(a)); // Print the sorted array
    }

    public static void Insertion(int[] a, int s) {
        for (int i = 1; i < s; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
}
