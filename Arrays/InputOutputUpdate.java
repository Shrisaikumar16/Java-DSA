import java.util.*;

public class InputOutputUpdate {

    //call by reference
    public static void update(int mark[], int nonChangeable) {
        nonChangeable = 10;      //ye change nhi hoga Q ki samjh jaa ki wo array nhi h isliye.
        for (int i=0; i<mark.length; i++) {
            mark[i] = mark[i] + 1;
        }
    }
    public static void main(String args[]) {
        //Arrays Input Output And Update

        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of an array: " + marks.length);
        System.out.println("enter marks of phy, chem and maths in order");

        marks[0] = sc.nextInt();
        System.out.println("phy: " + marks[0]);
        marks[1] = sc.nextInt();
        System.out.println("chem: " + marks[1]);
        marks[2] = sc.nextInt();
        System.out.println("math: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage is: " + percentage);


        //update mark
        int mark[] = {97, 98, 99};
        int nonChangeable = 5;
        update(mark, nonChangeable);
        //print our mark
        for (int i=0; i<mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        System.out.println();
        System.out.println("nonchangeable is: " + nonChangeable);
        sc.close();
    }
}