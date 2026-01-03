import java.util.*;

public class Practice {
    public static void main(String args[]) {

        // to calculate the sum of even and odd numbers
        // int num[] = {1,2,3,4};
        // int even = 0;
        // int odd = 0;

        // for (int n : num) {
        //     if(n%2 == 0) {
        //         even+=n;
        //     } else {
        //         odd+=n;
        //     }
        // }
        // System.out.println("Sum of even numbers: " + even);
        // System.out.println("Sum of odd numbers: " + odd); 
        
        
        //To calcuate the sum of even and odd numbers
        Scanner sc = new Scanner(System.in);
        int choice;
        int even = 0;
        int odd = 0;    
        int n;
        
        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            
            if(n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
            System.out.println("press 1 to continue or 0 to exit: ");
            choice = sc.nextInt();
        }while (choice == 1);

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);



        //To find the factorial of a number
        System.out.println("Enter the number to find its factorial: ");
        int fact = sc.nextInt();
        int store=1;

        while(fact>=1) {
            store = store*(fact);
            fact--;
        }
        System.out.println(store);


        //Maams method
        int facto=1;
        System.out.print("Enter any positive integer:");
        int numb=sc.nextInt();
        for(int i=1; i<=numb; i++) {
            facto*=i;
        }
        System.out.println("Factorial: "+facto);



        //To enter table of any number
        System.out.println("Enter any number to find its table: ");
        int number = sc.nextInt();
        int table = 1;
        System.out.println("Table of " + number + " is ");

        for (int i=1; i<=10; i++) {
            table = number * i;
            System.out.println(number + " * " + i + " = " + table);
        }

        sc.close();
    }
}
