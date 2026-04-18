import java.util.*;

public class StringBasics {

    public static void printLetters(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String ("xyz@#1234");

    //Strings are immutable (means String me changes nhi ho sakte, changes krne k liye ek nayi string banani padegi)
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);

    String fullName = "Tony Stark";
    System.out.println(fullName.length());

    //Concatenation
    String firstname = "Shrisaikumar";
    String lastname = "Sonari";
    String fullname = firstname + " " + lastname;
    System.out.println(fullname);
    System.out.println(fullname.charAt(0));

    printLetters(fullname);
    }
}
