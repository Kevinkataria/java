import java.util.Scanner;

public class SelectionSort {

    // Function to perform selection sort
    void sort (int arr[]) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
        int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
        

        // Swap the found minimum element with the first element
               int temp = arr[min_idx];
               arr[min_idx] = arr[i];
               arr[i] = temp;
    }
}

        // Method to print the array
    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
            System.out.println();
       }

public static void main(String args[]) {
        // Create a scanner to get user input
        Scanner scn = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        // Create an array of size n
        int arr[] = new int[n];

        // Prompt the user to input elements in the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Create an instance of SelectionSort and sort the array
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array: ");
        ob.printArray(arr);
    }
}