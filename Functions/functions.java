import java.util.*;

public class functions {

    //jab yaha void use krenge tab kuch return krne ki zrurat nhi
    //lkin jab int use krenge tab return krna padta ki kitne baar print kiya
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2) { //parameters
        int sum = num1 + num2;
        return sum;
        
    }
    public static void main(String args[]) {
        printHelloWorld();  //function call
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        
        int sum = calculateSum(a, b);  //here a and b are arguments
        System.out.println(sum);

        sc.close();
    }
}