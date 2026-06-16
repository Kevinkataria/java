import java.util.Scanner;

class Main {
pulic static void main(String[] args) {
    Scanner scn= new Scanner(System.in);


    //What to enter
    //fist enter t number of test cases
    //then enter t numbers (n), one per line
    System.out.println("Enter number of test cases (t): ");
    int t = scn.nextInt();
    for(int i=1; i<=t; i++){
        System.out.println("Enter number (n): ");
        int n = scn.nextInt();
        int count = 0;
        for ( int div=2; div*div<=n; div++){
            if(n%div==0){
                count++;
                break;
            }
        }
        if(n <= 1){
            System.out.println(n + " is not a prime number.");{
        
        } else if (count == 0) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
