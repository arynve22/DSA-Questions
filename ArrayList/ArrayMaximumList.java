package ArrayList;
import java.util.ArrayList;

 public class ArrayMaximumList {
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        System.out.println(List);

int max = Integer.MIN_VALUE;
            //first way to find maximum element in the list
        // for(int i=0; i<List.size(); i++){
        //     if(List.get(i) > max){
        //         max = List.get(i);
        //     }

        // }

            //second way to find maximum element in the list
            for(int i=0; i<List.size(); i++){
                max = Math.max(max, List.get(i));
            }
             System.out.println("Maximum element in the list is: " + max);
        }
        //System.out.println("Maximum element in the list is: " + max);
    }
 