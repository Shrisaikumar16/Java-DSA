import java.util.*;
public class HomeWork {

    public static int isVowel(String str) {
        int count = 0;
        for (int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        return count;
        
    }

    //Question 2) Check Anagram 
    public static void anagram(String str2, String str3) {
        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();

        //first check if lengths are same
        if (str2.length() == str3.length()) {
            //convert string into char array
            char [] str2charArray = str2.toCharArray();
            char [] str3charArray = str3.toCharArray();

            //sort the char array
            Arrays.sort(str2charArray);
            Arrays.sort(str3charArray);

            // if the sorted char arrays are sameor identical then the strings areanagram
            boolean result = Arrays.equals(str2charArray, str3charArray);
            if (result) {
                System.out.println(str2 + " and " + str3 + " are anagrams of each other.");
            } else {
                System.out.println(str2 + " and " + str3 + " are not anagrams of each other.");
            }
        }
        else {
            //Case when length are not same
            System.out.println(str2 + " and " + str3 + " are anagrams of each other because of their mismatched length.");
        }

    }
    public static void main(String args[]) {
        // String str = new Scanner(System.in).next();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Total vowels in lowercase are: " + isVowel(str));


        //Question 2) Check Anagram
        String str2 = "earth";
        String str3 = "heart";

        anagram(str2, str3);
    }
}
