

public class bubbleSort {

    public static void bubbleSortExample(int[] arr,int n){
       //int n= arr.length;
        for(int i=0;i<n-1;i++){
             boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    swap=true;
                }
            }
            if(swap == false){
                break;
            }
        }
    }   
    
    public static void printSorted(int[] arr,int n){
       // int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int[] arr = {6,7,4,8,3,2,1};
        int n =arr.length;
        System.out.println("Before Sorting algorthim: ");
        printSorted(arr,n);
       
        System.out.println("After Sorting algorthim: ");
        bubbleSortExample(arr,n);
        printSorted(arr,n);
        
    }
}