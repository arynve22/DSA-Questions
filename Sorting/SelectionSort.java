

public class SelectionSort {
    public static void selectionSortExample(int[] arr){
        int n= arr.length;

        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            //swap the index in first ways and using i value
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }

    }

    public static void DisplaySort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6,7,4,8,3,2,1};
        //int n =arr.length;
        System.out.println("Before Sorting algorthim: ");
        DisplaySort(arr);
       
        System.out.println("After Sorting algorthim: ");
       selectionSortExample(arr);
        DisplaySort(arr);
    }
}
