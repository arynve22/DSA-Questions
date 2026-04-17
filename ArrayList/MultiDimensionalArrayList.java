package ArrayList;
import java.util.*;

public class MultiDimensionalArrayList {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainList.add(list2);    

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        mainList.add(list3);
        System.out.println(mainList);

        for(int i = 0; i < mainList.size(); i++){
            ArrayList<Integer> currlist = mainList.get(i);
            for(int j = 0; j< currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
