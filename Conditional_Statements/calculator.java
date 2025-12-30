import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);     
        System.out.println("enter a: ");  
        int a = sc.nextInt();
        System.out.println("enter b: ");  
        int b = sc.nextInt();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }
        sc.close();
    }
}
