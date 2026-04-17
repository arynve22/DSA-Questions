package ArrayList;
import java.util.ArrayList;
import java.util.List;


public class Classroom {
    public static void main(String[] args){
        ArrayList<Integer> List1 = new ArrayList<>();
            List1.add(1);  //O(1)
            List1.add(2);  //O(1)
            List1.add(3);  //O(1)
            List1.add(4);  //O(1)
            System.out.println(List1);
            //System.out.println(List1.get(2)); //O(1)

                //get operation - O(1) constant time complexity
            int element = List1.get(2);
            System.out.println(element);

            //Delete operation - O(n) linear time complexity
            List1.remove(2); //O(n)
            System.out.println(List1);

            //update operation - O(1) constant time complexity
            List1.set(1, 10); //O(1)
            System.out.println(List1);
        
            //contains operation - O(n) linear time complexity
            System.out.println(List1.contains(4) );
            System.out.println(List1.contains(12) );  

            List1.add(3,3); //O(n) linear time complexity
            System.out.println(List1);

            //O(1) constant time complexity
            System.out.println(List1.size()); 
   
        }
}
