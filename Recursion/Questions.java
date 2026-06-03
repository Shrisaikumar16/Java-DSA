public class Questions {

    //Question 1) Print numbers in decreasing order
    public static void decreasingOrder(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        decreasingOrder(num-1);
    }

    //Question 2) Print numbers in increasing order
    public static void increasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n + " ");
    }

    // Question 3) Factorial of n
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fac = n * fact(n-1);
        return fac;
    }

    //Question 4)Sum of first n natural numbers
    public static int calcSum(int num) {
        if (num == 0) {
            return 0;
        }
        int snm1 = calcSum(num - 1);
        int sn = num + snm1;
        return sn;
    }

    public static int calSum(int num) {
        if (num==1) {
            return 1;
        }
        int sum = num + calSum(num-1);
        return(sum);
    }

    //Question 5) print nth fibonacci number
    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int fnm1 = fibonacci(num-1);
        int fnm2 = fibonacci(num-2);
        int fn = fnm1 + fnm2;
        return fn;

    }

    //Question 6) Check if the array is sorted
    public static boolean isSorted(int[] arr, int i) {
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);

    }

    //Question 7) First occurence of the given element
    public static int firstOccurence(int[] arr, int i, int key) {
        if (arr[i] == key) {
            return i;
        }
        if (i == arr.length-1) {
            return -1;
        }
        return firstOccurence(arr, i+1, key);
    }

    //Question 8) Last occurence of the given element
    public static int lastOccurence(int[] arr, int i, int key2) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, i+1, key2);
        if (isFound == -1 && arr[i] == key2) {
            return i;
        }
        return isFound;
    }

    //Question 9) Print x to the power n
    public static int power(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        int prod = base * power(base, pow-1);
        return prod;
    }

    //Question 10) Print x to the power n (Optimized)
    public static int optimizePower(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        int halfPower = optimizePower(base, pow/2);
        int evenOddPow = halfPower * halfPower;
        
        if (pow%2 != 0) {
            evenOddPow = base * evenOddPow;
        }

        return evenOddPow;
    }

    public static void main(String args[]) {
        int num = 5;

        //Question 1) Print numbers in decreasing order
        increasingOrder(num);

        //Question 2) Print numbers in decreasing order
        decreasingOrder(num);

        //Question 3) Factorial of n
        System.out.println(fact(num));

        //Question 4)Sum of first n natural numbers
        System.out.println(calcSum(num));
        System.out.println(calSum(num));
        
    
        //Question 5) print nth fibonacci number
        System.out.println(fibonacci(num));

        //Question 6) Check if the array is sorted
        int arr[] = {1,2,3,4};
        int i=0;
        System.out.println(isSorted(arr, i));

        //Question 7) First occurence of the given element
        int arr2[] = {8, 3, 6, 9, 5, 10, 2, 3, 4};
        int key = 4;
        System.out.println(firstOccurence(arr2, i, key));

        //Question 8) Last occurence of the given element
        int arr3[] = {8, 3, 6, 9, 5, 10, 2, 5, 4};
        int key2 = 5;
        System.out.println(lastOccurence(arr3, i, key2));

        //Question 9) Print x to the power n
        int pow = 4;
        int base = 2;
        System.out.println(power(base, pow));

        //Question 10) Print x to the power n (Optimized)
        System.out.println(optimizePower(base, pow));
    }
}