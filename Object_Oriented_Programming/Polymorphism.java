public class Polymorphism {
    
    //Method Overload
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.9, (float)2.1));
        System.out.println(calc.sum(1,2, 3));

    //This is method Over-ride
        Deer d = new Deer();
        d.eat();
    }
}

//This is method Over-ride
class Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}
//This is method Over-ride

//Method overload
class Calculator {
    int sum (int a, int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
//Method overload
