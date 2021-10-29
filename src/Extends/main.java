package Extends;

public class main {
    public static void main(String[] args) {

        Dog d = new Dog();
        System.out.println("My name is "+ d.getName());
        d.eat();
        d.bark();
        Cat c = new Cat();
        System.out.println("My name is "+ c.getName());
        c.eat();
        c.meow();
        Bird b = new Bird();
        System.out.println("My name is "+ b.getName());
        b.eat();
        b.fly();

    }
}
