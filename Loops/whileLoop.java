import java.util.*;
public class whileLoop {
    public static void main (String args[]) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("Hello world");
            counter++;
        }


        //print number from 1 to 10
        int number = 1;
        while (number <= 10) {
            System.out.print(number+" ");
            number++;
        }
        System.out.println();


        //print numbers from 1 to n
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.print(count+ " ");
            count++;
        }
        System.out.println();


        //sum of first n natiral numbers
        System.out.println("Enter m to find sum of m natural numbers: ");
        int m = sc.nextInt();
        int sum = 0;
        int count2 = 1;
        while (count2 <= m) {
            sum += count2;
            count2++;
        }
        System.out.println("sum is " + sum);


        //to reverse the number
        int num = 10899;
        int reverse = 0;
        while (num>=1) {
            int ls = num%10;
            reverse = ((reverse * 10) + ls);
            num/=10;
        }
        System.out.println(reverse);
        sc.close();
    }
}