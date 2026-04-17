public class Palindrome {

    //Question 1) Chcek if Palindrome 
    public static boolean isPalindrome(String str) {
        for (int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x=0, y=0;

        for (int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);

            //South
            if (dir == 'S') {
                y--;
            } 
            else if ( dir == 'N') {
                y++;
            }
            else if ( dir == 'W') {
                x--;
            }
            else if ( dir == 'E') {
                x++;
            }

        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);   //yaha pe typecast kiya hai

    }

    public static void main(String args[]){
        //Question 1) Palindrome
        String str = "racecar";
        System.out.println(isPalindrome(str));

        //Question 2) Find Shortest Path
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));


    }
}
