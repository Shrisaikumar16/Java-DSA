public class Rhombus {

    //Solid Rhombus Pattern
    public static void solidRhombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Hollow Rhombus
    public static void hollowRhombus(int rows, int cols) {
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=cols; j++) {
                if (i==1 || j==1 || i==rows || j==cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

        System.out.println();
        }
    }

    //Diamond Pattern
    public static void diamond(int n) {
        //Part 1
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            for (int j=1; j<=i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
        //Part 2
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            for (int j=1; j<=i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    //Didi k method ka diamond
    public static void didiDiamond(int n) {
        // Part 1
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Part 2
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {

        //Rhombus
        solidRhombus(5);
        hollowRhombus(8, 6);
        diamond(4);
        didiDiamond(4);
    }
}
