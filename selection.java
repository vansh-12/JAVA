import java.util.*;

public class selection {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt(); // Read the size of the array
       int a[] = new int[s]; // Initialize the array
       for(int i = 0; i < s; i++){
           a[i] = sc.nextInt(); // Read the elements of the array
        }
        sc.close();
        Selection(a, s); // Sort the array
        System.out.println(Arrays.toString(a)); // Print the sorted array
    }
   
   public static void Selection(int [] a, int s){
       for(int i = 0; i < s - 1; i++){
           int min = a[i]; // Initialize the minimum element
           int loc = i; // Initialize the location of the minimum element
           for(int j = i + 1; j < s; j++){
               if(min > a[j]){ // If a smaller element is found
                  min = a[j]; // Update the minimum element
                  loc = j; // Update the location of the minimum element
               }
           }
           swap(a, i, loc); // Swap the minimum element with the first unsorted element
       }
   }

   public static void swap(int [] a, int i, int loc){
       int temp = a[i]; // Temporarily store the first unsorted element
       a[i] = a[loc]; // Replace the first unsorted element with the minimum element
       a[loc] = temp; // Replace the minimum element with the first unsorted element
   }
}
