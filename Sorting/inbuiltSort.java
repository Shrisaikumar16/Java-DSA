import java.util.*;
public class inbuiltSort {

public static void printArr(Integer arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = {5, 4, 1, 3, 2};
        //reverse order k liye use Collections.reverseOrder() and also declare variable as "Integer" rather tah "int"
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
