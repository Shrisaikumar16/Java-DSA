public class Practice {

    //return true if any element appears twice in the array
    public static boolean ifDistinct(int nums[]) {
        boolean compare = false;

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    compare = true;
                }
            }
        }
        return compare;
    }
    public static void main(String args[]) {
        
        //search whether number repeats twice in an array
        int nums[] = {1, 2, 3, 4, 5, 1};
        System.out.println(ifDistinct(nums));

    }


}
