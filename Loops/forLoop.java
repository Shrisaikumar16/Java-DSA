public class forLoop {
    public static void main(String args[]) {

        //to print square pattern
        for (int i=1; i<=4; i++) {
            System.out.println("xxxx");
        }
        
        //To print triangle star pattern
        for (int i=1; i<=4; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //to print reverse of a number
        int n = 10899645;
        int reverse = 0;
        for ( ; n!=0; n/=10) {
            int digit = n%10;
            reverse = reverse * 10 + digit;
        }
        System.out.println(reverse);
        
        int num = 10899645;
        while (num>=1) {
            int rev = num%10;
            System.out.print(rev+ " ");
            num/=10;
        }
        System.out.println();
    }
}
