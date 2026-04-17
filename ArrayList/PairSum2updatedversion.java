package ArrayList;
import java.util.*;

public class PairSum2updatedversion {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int breakpoint = -1;
            for(int i = 0; i<list.size(); i++ ){
                if(list.get(i) > list.get(i+1)){
                    breakpoint = i;
                    break;
                }
            }
            int left = breakpoint + 1; //smallest element
            int right = breakpoint; //largest element

            while(left != right) {
                if(list.get(left) + list.get(right) == target){
                    return true;
                }
                //case 2
                if(list.get(left) + list.get(right) < target){
                    left = (left+1)%list.size();
                }else {
                    right =(list.size() + right -1)%list.size();
                }
            }
            return false;

        }  
         
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 20;
        System.out.println(list);
        System.out.println(pairSum2(list, target));
    }
}
