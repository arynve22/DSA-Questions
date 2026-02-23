import java.util.*;

abstract class Animal {
    void eat(){
        System.out.println("animals eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk(){
        System.out.println(" house Walk on 4 legs ");
    }
}

class Dog extends Animal{
    void walk(){
        System.out.println("dogs Walk on 4 legs ");
    }
}

public class abstractionExample {
    public static void main(String args[]) {
        //subclass making the object for runing 
        Horse h = new Horse();
        h.eat();
        h.walk();

        //sub class and print the subclass 
        Dog d =new Dog();
        d.eat();
        d.walk();
    }
}