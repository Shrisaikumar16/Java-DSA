// public class TrappingWater {

//     public static int TrappingWater(int height[]) {

//         int n = height.length;
//         //max left as auxilary array
//         int maxLeft[] = new int [n];
//         maxLeft[0] = height[0];

//         for (int i=1; i<n; i++) {
//             maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
//         }


//         //max right as auxilary array
//         int rightMax[] = new int [n];
//         rightMax[n-1] = height[n-1];
        
//         for (int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         //loop
//         for (int i=0; i<n; i++) {
//             int waterLevel = Math.min(maxLeft[i], rightMax[i]);
//             trappedWater += waterLevel - height[i];
//         }

//         return trappedWater;
//     }
//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};

//         System.out.println(TrappingWater(height));
//     }

// }




// public class TrappingWater {

//     public static int TrappingWater(int heigths[]) {
//         int n = heigths.length;
//         int leftMax[] = new int [n];
//         leftMax[0] = heigths[0];

//         //declaring left max
//         for (int i=1; i<n; i++) {
//             leftMax[i] = Math.max(leftMax[i-1], heigths[i]);
//         }

//         //declaring max right
//         int rightMax[] = new int [n];
//         rightMax[n-1] = heigths[n-1];
//         for (int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(heigths[i], rightMax[i+1]);
//         }


//         int trapWater = 0;
//         for (int i=0; i<n; i++) {
//             int waterflow = Math.min(leftMax[i], rightMax[i]);
//             trapWater += waterflow-heigths[i];


//         }

//         return trapWater;



//     }
//     public static void main(String args[]) {
//         int heights[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(TrappingWater(heights));

//     }
// }






public class TrappingWater {
    public static int trappingWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int [n];
        leftMax[0] = height[0];

        for (int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);

        }

        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        
        for (int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }


        int trapWater = 0;
        for (int i=1; i<n; i++) {
            int waterflow = Math.min(rightMax[i], leftMax[i]);
            trapWater += waterflow - height[i];

        }
        return trapWater;

    }
    public static void main(String args[]) {
        int heights[] = {4, 2, 0, 6, 3, 2 ,5};
        System.out.println(trappingWater(heights));

    }
}