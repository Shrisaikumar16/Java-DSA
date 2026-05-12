public class Questions {

    // Question 1) Check if a number is Odd or Even
    public static void oddOrEven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    //Get i'th bit
    public static int getIthBit(int n, int i) {
        int bitmask2 = 1<<i;
        if ((n & bitmask2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //Set i'th bit
    public static int setIthBit (int n, int i) {
        int bitmask3 = 1<<i; //bas check krre i'th position pe 0 h ya 1, aur jo bhi hoga uske jagah 1 daal denge
        return n | bitmask3;
    }

    //Clear i'th bit 
    public static int clearIthBit(int n, int i) {
        int bitmask4 = ~(1<<i);
        return n & bitmask4;

    }

    //Update i'th bit
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int Bitmask = newBit<<i;
        return n | Bitmask;
    }

    //Clear last i bits
    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;      
        return n & bitMask;
    }

    //Clear Bits in Range
    public static int clearBitsinRange(int n, int i, int j) {
        int a = ((~0) << i);
        int b = (1<<i) -1;
        int bitmask = a | b;
        return n & bitmask;
    }

    //Question 2) Check if a number is a power of two or not
    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }

    //Question 3) Count Set Bits in a Number.
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {  //check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //Question 4)Fast Exponentiation Code
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n>0) {
            if ((n&1) != 0) {  //check LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String args[]) {
        // Question 1) Check if a number is Odd or Even
        oddOrEven(3);   //output is odd number
        oddOrEven(110);  //output is even number
        oddOrEven(14);   //output is even number

        System.out.println(getIthBit(12, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearBitsinRange(10, 2, 4));

        //Question 2) Check if a number is a power of two or not
        System.out.println(isPowerOfTwo(15));

        //Question 3) Count Set Bits in a Number.
        System.out.println(countSetBits(10));

        //Question 4)Fast Exponentiation Code
        System.out.println(fastExpo(5, 3));

    }
}
