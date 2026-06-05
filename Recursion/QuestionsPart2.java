public class QuestionsPart2 {

    // Question 1) Tiling Problem
    public static int tilingProblem(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        int fnm1 = tilingProblem(n-1);

        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    //Question 2) Remove duplicates in a string
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        } else {
            //unique char
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    //Question 3) Friends pairing Problem
    public static int friendsPairing(int n) {

        if (n == 1 || n==2) {
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totways
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    //Question 4) Binary Strings problem
    public static void printBinStrings(int n, int lastPlace, String str) {
        //base case
        if (n==0) {
            System.out.println(str);
            return;
        }

        //kaam
        printBinStrings(n-1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n-1, 1, str + "1");
        }
    }


    public static void main(String args[]) {

        // Question 1) Tiling Problem
        System.out.println(tilingProblem(6));
        
        //Question 2) Remove duplicates in a string
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

        //Question 3) Friends pairing Problem
        System.out.println(friendsPairing(3));
    
        //Question 4) Binary Strings problem
        printBinStrings(3, 0, "");


    }
}
