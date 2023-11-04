import java.util.*;

public class quick {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // Read the size of the array
        int a[] = new int[s]; // Initialize the array
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt(); // Read the elements of the array
        }

        quick_sort(a, 0, s - 1); // Sort the array
        System.out.println(Arrays.toString(a)); // Print the sorted array
    }

    public static void quick_sort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quick_sort(a, p, q - 1);
            quick_sort(a, q + 1, r);
        }
    }

    public static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p;
    
        for (int j = p; j <= r - 1; j++) {
            if (a[j] <= x) {
                swap(a, i, j);
                i++;
            }
        }
    
        swap(a, i, r);
        return i;
    }
    


    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
