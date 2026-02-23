import java.util.*;


abstract class Shape {
    String color; // instance variable 
    abstract double area(); //abstract method without implementation 
    public abstract String toString(); //abstract method without implementation 

        // in abstract class can also used the constructor 
    public Shape(String color){
        System.out.println("shape constractor called");
        this.color = color;
    }
        // this used to concrete method 
    public String getColor(){
        return color;
    }
} 

class Circle extends Shape {

        double radius;
    public Circle(String color , double radius){
        super(color);
        System.out.println("circle constractor called ");
        this.radius  = radius;
    }

    double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public String toString(){
        return "circle color is " + super.getColor( ) + " and area is :" + area( );
}

}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle (String color ,double length , double width){
        super(color);
        System.out.println("Rectangle constructor called ");
        this.length = length;
        this.width = width;
    }
    double area(){
        return length*width;
    }

    public String toString(){
        return "Rectangle coloe is :" + super.getColor() + " and area is :" + area();
    }
    
}
public class abstractExmple2 {
    public static void main(String[] args) {
        Circle s1 = new Circle("red", 5);
        Rectangle s2 = new Rectangle("blue", 4, 5);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
    }

}
