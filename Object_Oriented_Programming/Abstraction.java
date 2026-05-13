public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();


    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animla Constructor called.");
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();  //ye bas ek idea h jo parent class ne diya h
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walk on 4 legs");  //ye actual implementation jo parent class se function lene k bad hogi
    }
}

class Mustang extends Horse {
    Mustang () {
        System.out.println("Mustang Constructor called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}