import java.util.Scanner;

public class SpanOfArry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            if (val > max) max = val;
            if (val < min) min = val;
        }

        int span = max - min;
        System.out.println("The span of the array is: " + span);
    }
}