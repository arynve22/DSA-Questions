import java.util.Arrays; //Arrays is used to that sort the unsorted array
import java.util.Collections; // Collections is an package that  is used to resverse the array sorted list 
public class collectionReverseSorted {
    public static void Display(Integer [] arr){//printing the sorted array is used to solve its 
        int n=arr.length;
        for(int i =0 ; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /* ham log Integer is liye use kiye hai jaise ki ham log usko object ke throw hhi call ho 
         * normal ke tara nahi hota hai
         */
        Integer arr[] = {4,5,9,1,2,7,3};
        //here I used the collections.reverseOrder() method to call the inbuilt method to sort the array and reverse its 
        Arrays.sort(arr,Collections.reverseOrder());
        Display(arr);

    }
}
