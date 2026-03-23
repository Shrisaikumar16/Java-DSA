public class HomeWork {

    //Question 1) print the number of 7's in 2D array
    public static int printElement(int [][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return (count);
    }
    

    //Question 2) Print sum of numbers in second row
    public static int SumOfNumbers(int arr2[][]) {
        int n = arr2.length;
        int m = arr2[0].length;
        int sum = 0;
        // for (int i=1; i<n-1; i++) {
        //     for (int j=0; j<m; j++) {
        //         sum+= arr2[i][j];
        //     }
        // }
        for (int j=0; j<m; j++) {
            sum += arr2[1][j];
        }
        return sum;
    }

    //Question 3) Transpose of a Matrix
    public static void TransposeMatrix(int matrix[][]) {
        //my method
        // int n = matrix.length;
        // int m = matrix[0].length;
        // for (int i=0; i<m; i++) {
        //     for (int j=0; j<n; j++) {
        //         System.out.print(matrix[j][i] + " ");
        //     }
        //     System.out.println();
        // }

        //sir ka method
        int n = matrix.length;
        int m = matrix[0].length;
        int transpose[][] = new int [m][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(transpose[i][j] + " ");;
            }
            System.out.println();
        }
    }


    //Question 4) Transpose Square Matrix
    public static void TransposeSquareMatrix(int matrix2[][]) {
        int n = matrix2.length;
        int m = matrix2[0].length;

        for (int i=0; i<n; i++) {
            for (int j=i; j<m; j++) {
                // if (i!=j) {
                    int temp = matrix2[i][j];
                    matrix2[i][j] = matrix2[j][i];
                    matrix2[j][i] = temp;
                // }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
            System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        //Question 1
        int arr[][] = {{4,7,8}, {8,8,7}};
        System.out.println(printElement(arr));

        //Question 2
        int arr2[][] = {{1,4,9}, {11,4,3}, {2,2,3}};
        System.out.println(SumOfNumbers(arr2));

        //Question 3
        int matrix[][] = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}, {41, 42, 43}};
        TransposeMatrix(matrix);
        
        //Question 4)
        int matrix2[][] = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
        TransposeSquareMatrix(matrix2);
    }
}