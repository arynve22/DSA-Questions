
import java.util.*;
public class insertionSortExample {
    public static void insertionSort(int[] arr){
        int n =arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev=i-1;
            while (prev >= 0 && curr < arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }

    }
    public static void DisplaySort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args ){
        int[] arr= {2,5,7,4,1};
        
        System.out.println("Before sorting algorithm ");
        DisplaySort(arr);
        System.out.println("After sorting algorithm ");
        insertionSort(arr);
        DisplaySort(arr);
         

    }
}
