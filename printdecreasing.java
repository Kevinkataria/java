import java.io.*;
import java.util.*;

public class printdecreasing {

    public static void main(String[] args) throws Exception {
    // Create a Scanner object to read input from the user
    Scanner scn = new Scanner(System.in);

    // Prompt the user to enter a number (n)
    System.out.print("Enter a number: ");
    int n = scn.nextInt();

    // Call the method to print numbers decreasing from n to 1
    printDecreasing(n);
    }

    // Method to print decreasing numbers from n to 1
    public static void printDecreasing(int n) {
    // Base case: if n is 0, return (stop recursion)
    if (n == 0) {
        return;
    }  
    // Print the current number
    System.out.println(n);
    // Recursive call to print the next number (n-1)
    printDecreasing(n - 1);
    }
}