import java.util.*;

public class doWhileLoop {
    public static void main(String args[])   {
        int counter = 1;
        do {
            System.out.println("Hello World");
            counter++;
        } while (counter <= 10);

        //break statement example
        for (int i=1; i<=5; i++) {
            if (i == 3) {
                break; // exits the loop when i is 3
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop exited at i = 3");


        //to enter a multiple of 10
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);


        //to skip any number
        for (int i=1; i<=5; i++) {
            if(i==3) {
                continue;
            }
            System.out.println(i);
        }


        //display all numbers entered by user except multiple of 10
        // do {
        //     System.out.println("ENter your number: ");
        //     int num = sc.nextInt();
        //     if (num % 10 == 0) {
        //         continue; // skips the rest of the loop for this iteration
        //     }
        //     System.out.println("You entered: " + n);
        // } while (true);


        //check if a number is prime
        int n = sc.nextInt();

        if(n==2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n%i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime = true) {
                System.out.println(isPrime + " n is prime");
            } else {
                System.out.println(isPrime + " n is not prime");
            }
        }
        sc.close();

    }
}
