import java.util.*;
public class countingSortExample {
    public static void CountingSort(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
;        
        for(int i=0;i<n;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        int count[] = new int[max+1];

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
        public static void Display(int[] arr){
            int n=arr.length;
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void main(String[] args){
            int[] arr = {6,4,6,3,2,8,7,3,2,1,1};

            System.out.println("Sorted arrays");
            CountingSort(arr);
            Display(arr);
        }
}
