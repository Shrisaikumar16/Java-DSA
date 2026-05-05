public class HomeWork {

    //Question 1)Swap two numbers without using any third variable
    public static void SwapNumbers(int a, int b) {
        // a = a+b;
        // b = a-b;
        // a = a-b;
        a = a^b;
        b = b^a;
        a = b^a;
        System.out.println(a + " " + b);
        //Note: same numbers ka XOR operation 0 hota hai. Ex: 3^3=0
    }

    public static void main(String args[]) {
        //Swap two numbers without using any third variable
        int a = 2;
        int b = 4;
        SwapNumbers(a, b);

        //Question 2) Add 1 to an integer using Bit Manipulation (Hint: try using Bitwise NOT Operator)
        System.out.println((~5)+1);

        //Question 3) Convert lowerCase to upperCase
        char ch = 'g';
        char upper = (char)(ch & '_');  //'_' has ascii value 95 which has the 5th bit as 0, which helps to convert to uppercase
        System.out.println(upper);

        //Question 3) Convert upperCase to lowerCase
        char ch2 = 'G';
        char lower = (char)(ch2 | ' ');  //'_' represents 32 which helps to convert to lowercase
        System.out.println(lower);

    }
}
