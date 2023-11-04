import java.util.*;

public class bubble {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt(); // Read the size of the array
       int a[] = new int[s]; // Initialize the array
       for(int i = 0; i < s; i++){
           a[i] = sc.nextInt(); // Read the elements of the array
       }
       Bubble(a, s); // Sort the array
       System.out.println(Arrays.toString(a)); // Print the sorted array
   }
   
   public static void Bubble(int [] a, int s){
       for(int i = 0; i < s - 1; i++){
           for(int j = 0; j < s-i-1; j++){
               if(a[j] > a[j+1]){ // If a smaller element is found
                  swap(a,j,j+1); // Swap the minimum element with the first unsorted element
               }
           }    
       }
   }

   public static void swap(int [] a, int j,int k){
       int temp = a[j]; // Temporarily store the first unsorted element
       a[j] = a[k]; // Replace the first unsorted element with the minimum element
       a[k] = temp; // Replace the minimum element with the first unsorted element
   }
}
