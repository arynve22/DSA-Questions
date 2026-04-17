package ArrayList;
import java.util.ArrayList;

public class ArraySwap {
    public static void swap(ArrayList<Integer> List, int index1, int index2){
        int temp = List.get(index1);
        List.set(index1, List.get(index2));
        List.set(index2, temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        System.out.println("Before swap: " + List);

        int index1 = 1 , index2 = 3;
        swap(List, index1, index2);
        System.out.println("After swap: " + List);
    }
    
}
