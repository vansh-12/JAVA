import java.util.*;

public class radix {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " words:");

        String[] inputArray = new String[size];
        for (int i = 0; i < size; i++) {
            inputArray[i] = sc.next();
        }

        // Find the maximum length of a word
        int maxLen = getMaxStringLength(inputArray);

        // Perform radix sort
        radixSort(inputArray, maxLen);

        System.out.println("Sorted array in lexical order:");
        System.out.println(Arrays.toString(inputArray));
    }

    public static void radixSort(String[] arr, int maxLen) {
        for (int i = maxLen - 1; i >= 0; i--) {
            countingSortByPosition(arr, i);
        }
    }

    public static void countingSortByPosition(String[] arr, int position) {
        final int ALPHABET_SIZE = 26; // Assuming lowercase alphabet

        int[] count = new int[ALPHABET_SIZE];
        String[] result = new String[arr.length];

        // Count occurrences
        for (String word : arr) {
            int index = (position < word.length()) ? (word.charAt(position) - 'a') : 0;
            count[index]++;
        }

        // Accumulate counts
        for (int i = 1; i < ALPHABET_SIZE; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in correct positions in result array
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = (position < arr[i].length()) ? (arr[i].charAt(position) - 'a') : 0;
            result[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy result array back to original array
        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    public static int getMaxStringLength(String[] arr) {
        int maxLen = 0;
        for (String word : arr) {
            maxLen = Math.max(maxLen, word.length());
        }
        return maxLen;
    }
}
