public class ifElse {
    public static void main(String args[]) {
        //if else statement example
        int age = 16;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        if (age > 13 && age < 18) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }

        //else if statement example
        int age2 = 13;
        if (age2 >= 18) {
            System.out.println("Adult");
        }
        else if (age2 >= 13 && age2 < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }

        
        //Ternary operator example
        int num = 10;
        String result = ((num%2)==0) ? "Even" : "odd";
        System.out.println(result);


        //Check if student has passed
        int marks = 89;
        String reportCard = (marks >= 33) ? "passed" : "failed";
        System.out.println(reportCard);
    }
}
