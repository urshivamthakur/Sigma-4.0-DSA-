public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base Class
class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

// Derived class or Sub-class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}