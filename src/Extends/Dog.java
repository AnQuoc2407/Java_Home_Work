package Extends;

public class Dog extends Animal{

    public Dog() {
        super("Dog 1");
    }

    @Override
    public void eat() {
        System.out.println("test");
    }

    public void bark(){
        System.out.println("Dog 1 is barking\n");
    }
}
