public class StringFunctions {

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i=si; i<ei; i++) {
            substr += str.charAt(i); 
        }
        return substr;
    }
    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else { 
            System.out.println("Strings are not equal");
        }

        if (s1.equals(s3)) {   //s3 'new' String me bana h isliye uski value check krne k liye .equals() function use krna pada
            System.out.println("Strings are equal");
        } else { 
            System.out.println("Strings are not equal");
        }

        //SubString
        String str = "HelloWorld";
        // System.out.println(substring(str, 0, 5));
        System.out.println(substring(str, 0, 5));
        
    }
}
