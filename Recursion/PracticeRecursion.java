public class PracticeRecursion {

    // Question1: For a given integer array of size N.
    // You have to find all the occurrences (indices) of a given element (Key) and print them.
    // Use a recursive function to solve this problem.
    public static void maxOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            // System.out.println(store);
            return;
        }
        
        if (arr[i] == key) {
            System.out.println(i);
        }
        maxOccurance(arr, key, i+1);
    }

    // Question 2)
    // You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”. 
    // Use a recursive function to solve this problem.
    // NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
    public static void numberToString(int num, String[] str) {
        if (num == 0) {   //num=2019
            return;
        }

        int lastDigit = num % 10;
        // int newDigit = num / 10;

        numberToString(num/10, str);
        System.out.println(str[lastDigit]);
    }

    //Question 3 :Write a program to findLength of aStringusing Recursion
    public static void StringLength(String str1, int n, int count) {
        if (n == str1.length()) {
            System.out.println(count);
            return;
        }

        // int currStr = str1.charAt(n);
        count++;
        StringLength(str1, n+1, count);
    }

    //Question 4: We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character
    public static int allContiguousSubstrings(String str2, int a, int forward) {
        int strLen = str2.length();
        
        // base case
        if (a == strLen) {
            return 0;
        }

        if (forward == strLen) {
            return allContiguousSubstrings(str2, a+1, a+1);
        }
        int count = (str2.charAt(a) == str2.charAt(forward)) ? 1:0;
        return count + allContiguousSubstrings(str2, a, forward+1);
    }

    //Question 5) Hanoi
    public static void hanoi(int n, char one, char two, char three) {

        if (n == 0) {
            return;
        }

        hanoi(n-1, one, three, two);

        System.out.println(one + " to " + three);

        hanoi(n-1, two, one, three);
    }

    public static void main (String args[]) {
        //Question 1)
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        int i = 0;
        maxOccurance(arr, key, i);

        //Question 2)
        int num = 2019;
        String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        numberToString(num, str);

        //Question 3)
        String str1 = "ApnaCollege";
        int n = 0;
        StringLength(str1, n, 0);

        //Question 4)
        String str2 = "abcab";
        int a = 0;
        int forward = 0;
        System.out.println(allContiguousSubstrings(str2, a, forward));

        //Question 5)
        char one = 'A';
        char two = 'B';
        char three = 'C';
        hanoi(3, one, two, three);

    }
}
