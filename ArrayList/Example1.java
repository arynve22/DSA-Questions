package ArrayList;
import java.util.ArrayList; 

public class Example1 {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        System.out.println(number);
        number.remove(2);
        System.out.println("Arraylist remove the index 2: " + number); 
    }

}
