public class Inheritance {
    public static void main(String args[]) {
    Fish shark = new Fish();
    shark.eat();

    Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    } 
}

//Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Derived Class or Subclass
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

class Mammal extends Animal {
    int legs;
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}

class Dog extends Mammal {
    String breed;
}