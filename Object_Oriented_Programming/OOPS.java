public class OOPS {

    //public static used here is called "access specifier"
    public static void main(String args[]) {
        //here used "Pen()"" is the class described below
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "sai";
        // myAcc.setPassword("sai");
        // System.out.println(myAcc.username);
    }
}

// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd;
//     }




//This is a blue print of the pen
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;     //yaha pe "this.color" refer krra ai "Pen" wali object k color ko
    }

    int getTip() {
        return this.tip;
    }



    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class Stduent {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

