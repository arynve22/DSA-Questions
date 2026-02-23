
import java.util.Arrays;
public class inbuiltSortArrays {

    public static void Display(int[] arr){
        int n=arr.length;
        for(int i =0 ; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7,8,4,5,2,3,1};
        System.out.println("sorted Array index");
        Arrays.sort(arr);
        Display(arr);
    }
    
}