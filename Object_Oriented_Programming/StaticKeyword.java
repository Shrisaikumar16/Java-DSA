public class StaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "VVM";
        
        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s1.schoolName = "VVM";
    }
}

class Student {
    static int returnPercentage(int math, int  phy, int chem) {
        return (math + phy + chem)/ 3;
    }
    String name;
    int roll;

    static String schoolName;  //ye static schoolName agar kisi bhi object me change kiiye toh wo sare objects me change ho jaegi

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}