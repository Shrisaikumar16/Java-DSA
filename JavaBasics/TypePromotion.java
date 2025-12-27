// import java.util.*;

public class TypePromotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(a);
        System.out.println(b-a);   //type promotion sirf expressions k sath hte jaha +,-,*,/ use krte

        //by default sbse bade wale data type me convert hote
        int c = 10;
        float d = 20.25f;
        long e = 25;
        double f = 30;
        double ans = c+d+e+f;
        System.out.println(ans);
        

    }
}
