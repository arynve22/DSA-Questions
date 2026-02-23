import java.util.*;

public class inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        dobby.run();
       System.out.println(dobby.legs);

    }
}
// super class/ Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void run(){
        System.out.println("run");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Memmal extends Animal {
    int legs;
}

class Dog extends Memmal {
    int breed;
}



//subclass / derived class 
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("Swins in water");
//     }
// }