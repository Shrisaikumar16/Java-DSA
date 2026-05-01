public class BitManipulation {
    public static void main (String args []) {
        // And Operator
        System.out.println((5 & 6)); //output is 4

        // Or Operator
        System.out.println((5 | 6)); //output is 7

        // Xor Operator
        System.out.println((5^6));  //output is 3

        // Binary One's compliment
        System.out.println(~5);   //output is -6

        //Binary left shift
        System.out.println((5<<2));  //here (5<<2) also means 5*2^8, 5 multiply by 2 to the power 8

        //Binary Right Shift
        System.out.println(6>>1);  //here (6>>1) also means 6/2^1, 6 divided by 2 to the power 1


    }
}