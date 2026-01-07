public class callByValue {

    //swap
    public static void callbyvalue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
    }

    //multiplication function
    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }


    //Factorial function
    public static int fact (int a) {
        int f = 1;
        for (int i=1; i<=a ; i++) {
            f = f*i;
        }
    return f;
    }


    //Binomial coeffcient (function to function call)
    public static int bincoeff (int n, int r) {
        int factn = fact(n);
        int factr = fact(r);
        int factnmr = fact(n-r);
        
        int bincoeff = factn / (factr * factnmr);
        return bincoeff;

    }

    //function overloading using parameters
    public static int add2 (int a, int b) {
        int add2 = a + b;
        return add2;
    }
    //yaha same name use kiya h user defined function me
    public static int add2 (int a, int b, int c) {
        int add2 = a + b + c;
        return add2;
    }


    //function overloading using data types
    public static float subtract(float a, float b) {
        float subtract = a - b;
        return subtract;
    }
    


    public static void main (String args[]) {
        int a = 4;
        int b = 9;
        callbyvalue(a, b);

        int prod = multiply(a,b);
        System.out.println("product of a and b is: " + prod);

        //multiplication
        prod = multiply(10, 20);
        System.out.println("new a * b = " + prod);

        //factorial
        int fac = fact(5);
        System.out.println(fac);

        //Binomial coefficient
        int binarycoefficient = bincoeff(5, 2);
        System.out.println("binary coeeficeint is: " + binarycoefficient);

        //function overloading using parameters
        System.out.println(add2(1,2));
        System.out.println(add2(1,2,3));
        
        //function overloading using data types
        System.out.println(subtract(7,3));
        






    }
}
