public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student("sai");  //For initalization
        System.out.println(s1.name);

        Student s2 = new Student(123);
        Student s3 = new Student();

        //Copy Constructor
        Student s4 = new Student();
        s4.name = "sharddha";
        s4.roll = 123;
        s4.password = "xyz";
        s4.marks[0] = 100;
        s4.marks[1] = 90;
        s4.marks[2] = 80;

        Student s5 = new Student(s4);
        s5.password = "abc";
        s4.marks[2] = 100;   //yaha pe s4 me bhi changes honge 
        for (int i=0; i<3; i++) {
            System.out.println(s5.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Shallow Copy Constructor
    // Student (Student s4) {
    //     marks = new int[3];
    //     this.name = s4.name;
    //     this.roll = s4.roll;
    //     this.marks = s4.marks;
    // }

    //Deep copy constructor
    Student(Student s4) {
        marks = new int [3];
        this.name = s4.name;
        this.roll = s4.roll;
        for (int i=0; i<3; i++) {
            this.marks[i] = s4.marks[i];
        }
    }

    //For initialization of constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;      //here "this.name" refers to the s1 object k student ka name
    }

    // There are three types of constructors
    //This is non parameterized type of constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
