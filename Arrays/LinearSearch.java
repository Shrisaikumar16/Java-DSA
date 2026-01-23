// import java.util.*;
public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //String type me index dhundna uski value match krke
    public static String linearFoodSearch(String menu[], String food) {
        for (int i=0; i<menu.length; i++) {
            if (menu[i].equals(food)) {
                return "found at index: " + i;
            } 
        }
        return "not found";
    }


    // to find largest and smallest in an array
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Key is at index; " + index);
        }
        
        //String Food linear Search
        String menu[] = {"dosa", "chole bhature", "samosa"};
        String food = "chole bhature";
        String foodCheck = linearFoodSearch(menu, food);
        System.out.println(foodCheck);


        //To find the largest and smallestin the array
        int nums[] = {1,2,6,5,3,};
        System.out.println("Largest value is: " + getLargest(nums));
        // System.out.println("Largest value is: " + getLargest(nums));
    }
}
