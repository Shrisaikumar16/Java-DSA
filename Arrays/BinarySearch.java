// import java.util.*;

public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end)/2;

            //comaparions
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid + 1;
            } else {  //left
                end = mid-1;
            }
        }
        return -1;
    }



    //Reverse an array
    public static void reverse(int number[]) {
        int first = 0, last = number.length-1;

        while(first < last) {
            //swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }


    //pairs in array
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for (int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }


    //Sub Arrays
    public static void printSubArrays(int numbers[]) {
        int tp = 0;
        for (int i=0; i<numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++) {
                int end = j;
                int add = 0;
                for (int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                    tp++;
                    add = add + numbers[k];
                }
                System.out.println("Sum is: " + add);
                System.out.println("maximum number is: ");
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("Total numbers: "+ tp);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 2;

        System.out.println("Index for key is: " + binarySearch(numbers, key));



        //reverse an array
        int number[] = {2, 4, 6, 8, 10};
        reverse(number);
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        // System.out.println(number);



        //Pairs in array
        int num[] = {2, 4, 6, 8, 10};
        printPairs(num);
        
        
        //Subarrays
        int numb[] = {2, 4, 6, 8, 10};
        printSubArrays(numb);

    }
}
