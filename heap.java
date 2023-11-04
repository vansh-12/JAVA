import java.util.*;

public class heap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // Read the size of the array
        int a[] = new int[s]; // Initialize the array
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt(); // Read the elements of the array
        }

        buildMaxHeap(a); // Build max heap
        for(int i = s - 1; i > 0; i--){
            swap(a, 0, i); // Swap root with last element
            maxHeapify(a, 0, i); // Restore max heap property
        }
        System.out.println(Arrays.toString(a)); // Print the sorted array
    }

    
    public static void buildMaxHeap(int[] a) {
        for(int i = a.length / 2 - 1; i >= 0; i--){
            maxHeapify(a, i, a.length); // Build max heap
        }
    }

    public static void maxHeapify(int[] a, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < heapSize && a[left] > a[largest]) {
            largest = left;
        }

        if (right < heapSize && a[right] > a[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(a, i, largest);
            maxHeapify(a, largest, heapSize);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
