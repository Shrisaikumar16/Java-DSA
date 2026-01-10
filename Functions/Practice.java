import java.util.*;

public class Practice {

    //method to compute average of numbers
    public static double average(double a, double b, double c) {
        return ((a+b+c)/3);
    }

    //method to check whether the number is even or odd
    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third number: ");
        double c = sc.nextDouble();

        double avg = average(a,b,c);
        System.out.println("The average of three numbers is: " + avg);
        System.out.println();

        //check odd or even with method and also check the method
        System.out.println("Enter number to chech whether its odd or even: ");
        int num = sc.nextInt();
        if(isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        sc.close();

        
    }

}
