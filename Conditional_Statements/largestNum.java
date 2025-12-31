import java.util.*;
public class largestNum {
    public static void main(String args[]) {

        // This program finds the largest of two numbers
        int a = 10;
        int b = 20;

        if(a >= b) {
            System.out.println("a is largest of 2");
        }
        else {
            System.out.println("b is largest of 2");
        }


        //Income tax calculation example
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;   
        }
        else if (income >= 500000 && income <1000000) {
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income*0.3);
        }
        sc.close();
        System.out.println("Your tax is: " + tax);


        //Print the largest of three numbers
        int e=5, d=3, c=4;

        if((c >= d) && (c >= e)) {
            System.out.println("Largest is c: " + c);
        }
        else if (d >= e) {
            System.out.println("largest is d: " + d);
        }
        else {
            System.out.println("largest is e: " + e);
        }

        
    }   
}