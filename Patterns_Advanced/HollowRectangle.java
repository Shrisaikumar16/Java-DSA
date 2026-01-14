public class HollowRectangle {

    //To print hollow rectangle
    public static void hollow_rectangle(int totrows, int totcols) {
        for (int i=1; i<=totrows; i++) {
            for (int j=1; j<=totcols; j++) {
                if (i==1 || i==totrows || j==1 || j==totcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //To print inverted rotated half triangle
    public static void invertedTriangle(int totrows){
        for (int i=1; i<=totrows; i++) {
            for (int j=1; j<=totrows-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    //inverted half pyramid with numbers
    public static void pyNum(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    //floyd's triangle
    public static void floydsTriangle(int n) {
        int counter = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }


    //0-1 triangle
    public static void zeroOneTriangle(int rows) {
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    //Butterfly Pattern
    public static void butterfly(int n) {
        for (int i=1; i<=n; i++) {

            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i=1; i<=n; i++) {

            for (int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }

            for (int j=1; j<=i-1; j++) {
                System.out.print("  ");
            }

            for (int j=1; j<=i-1; j++) {
                System.out.print("  ");
            }

            for (int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void didiButterfly(int n) {
        //1st half
        for (int i=1; i<=n; i++) {
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //Spaces - 2*(n-i)
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i=n; i>=1; i--) {
                    //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //Spaces - 2*(n-i)
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();    
        }
    }


    public static void main(String args[]) {
        hollow_rectangle(4,4);
        invertedTriangle(7);
        pyNum(5);
        floydsTriangle(5);
        zeroOneTriangle(5);
        butterfly(5);
        didiButterfly(4);
    }
}