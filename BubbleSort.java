import java.util.Scanner;

class BubbleSort {
    // An optimized version of Bubble Sort
    void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;

        // Outer loop to traverse through all array elements
        for (i = 0; i < n - 1; i++) {
            swapped = false;
           
            // Inner loop to compare adjacent elements
            for (j = 0; j < n - i - 1; j++) {
            
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; 
                }
            }

            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped)
                break;
        }
    }

//Function to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
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

        // Create an instance of BubbleSort and sort the array
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(arr, n);

        // Print the sorted array
        System.out.println("Sorted array: ");
        ob.printArray(arr);
    }
}

