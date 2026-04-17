package ArrayList;
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        System.out.println("Before sorting: " + List);

        //To sort in ascending order
        Collections.sort(List);
        System.out.println("After sorting: " + List);

        // To sort in reverse order
        Collections.sort(List, Collections.reverseOrder());
        System.out.println("After sorting in reverse order: " + List);

    }
}
