import java.util.*;

public class HomeWork {


    //1st question

    //My method after some weeks
    // public static boolean twice(int arr[]) {
    //     int check = 0;
    //     for (int i=0; i<arr.length-1; i++) {
    //         for (int j=i+1; j<arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 check = 1;
    //             }
    //         }
    //     }
    //     if (check == 1) return true;
    //     else {
    //         return false;
    //     }
    // }

    
    //Sir ka method
    // public static boolean containsDuplicate(int arr[]) {
    //     Arrays.sort(arr);  //it helps to sort array in increasing order
    //     for (int i=0; i<arr.length; i++) {
    //         if (arr[i] == arr[i+1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    //2nd Method (HashMap)
    public static boolean containsDuplicate(int arr[]) {
        HashMap<Integer, Integer>map = new HashMap<>();   //Syntax of HashMap, Memorize it
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if (map.get(arr[i]) > 1)
            return true;
        }
        return false;
    }


    //2nd Question (Rotated Sorted Array)
    public static int RotatedSorted(int nums[], int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = (low+high)/2;

            //check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            //check if the left array is sorted
            else if (nums[low] <= nums[mid]) {
                //if target is in the left half
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid;
                }
                else {
                    low = mid + 1;
                }
            }

            //check the right array is sorted
            else {
                //check if target is in right half
                if(mid + 1 <= high && target <= nums[high] && target >= nums[mid + 1]) {
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }

        }

        //if target not found
        return -1;
    }



    //3rd question (Maximum product array)
    public static int MaxProductSubArray(int[] num) {
        //Initialize max, min and ans with first element
        int max = num[0];
        int min = num[0];
        int ans = num[0];

        //Traverse from the second element
        for (int i=1; i<num.length; i++) {
            //If current number is negative them swap max and min
            if (num[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            //Update the maximum and minimum products endig at current index
            max = Math.max(max*num[i], num[i]);
            min = Math.min(min*num[i], num[i]);

            //update the answer
            ans = Math.max(ans, max);
        }
        return ans;
    }


    //4th question (Best time to buy and sell stock)
    public static int maxProfit(int[] prices) {
        // int bp = prices[0];
        // int profit = 0;
        // int sp = prices[0];
        // int max = 0;
        // for (int i=1; i<prices.length; i++) {
        //     if (sp < prices[i]) {
        //         sp = prices[i];
        //     }
        //     if (bp > prices[i]) {
        //         bp = prices[i];
        //         sp = prices[i];
        //     }
        //     profit = sp - bp;
        //     max = Math.max(max, profit);

        // }
        // if (max > 0) return max;
        // else return 0;
        
        //2nd method maam ka 
        int curr = prices[0];
        int profit = 0;
        int max = 0;

        for (int i=1; i<prices.length; i++) {
            if (curr > prices[i]) {
                curr = prices[i];
            } else {
                profit = prices[i] - curr;
                max = Math.max(max, profit);
            }
            
        }
        return max;
    }

    public static void main (String args[]) {

        //1st question
        // int arr[] = {1,2,3,4,5,6,1};
        // System.out.println(containsDuplicate(arr));


        //2nd Question (Rotated Search)
        // int nums[] = {4,  5, 6, 7, 0, 1, 2};
        // int target = 2;
        // System.out.println(RotatedSorted(nums, target));


        //3rd question (Maximum Product SubArray)
        // int num[] = {-4, 5, 2, 3, -2, 4, -5};
        // System.out.println(MaxProductSubArray(num));


        //4th question (Best time to buy or sell stocks)
        int prices[] = {2, 4, 1};
        System.out.println(maxProfit(prices));

    }
}
