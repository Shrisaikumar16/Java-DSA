public class DecimalBinary {

    //binary to decimal
    public static void binToDec(int binNum) {
        int myNUm = binNum;
        int pow = 0;
        int decNum = 0;
    
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNUm + " = " + decNum);

    }


    //decimal to binary
    public static void decToBin(int n) {
        int dec = n;
        int pow = 0;
        int binNum = 0;
        while(n>0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;

        }
        System.out.println("binary of " + dec + " is " + binNum);
    }


    public static void main(String args[]) {
        //binary to decimal
        binToDec(1001);

        //decimal to binary
        decToBin(9);
    }
} 