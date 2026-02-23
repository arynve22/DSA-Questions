import java.util.*;

public class FindLargestNo {
    public static int largestNum(int numbers[]){
        /* finding the largest number of the array function */
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;  

        for( int i = 0; i<numbers.length ; i++){
            if( largest < numbers[i]){
                largest = numbers[i]; //updating the value 
            }
             if(smallest > numbers[i]){
                smallest=numbers[i];
             }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }
    public static void main( String[] args ){
        int numbers[]= {1,2,6,3,5,10,9};
        System.out.println("largest value of the array: "+ largestNum(numbers));

    } 
}
