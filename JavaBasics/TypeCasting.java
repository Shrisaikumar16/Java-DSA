import java.util.*;

public class TypeCasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float marks = 99.99f;
        int marks2 = (int) marks;  //typecasting
        System.out.println(marks2);

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);

        byte b = 5;
        byte a = (byte) (b*2);  //yaha tyecasting zruri hai Q ki data type conversion hua hai with expressions
        System.out.println(a);
        sc.close();

    } 
    
}
