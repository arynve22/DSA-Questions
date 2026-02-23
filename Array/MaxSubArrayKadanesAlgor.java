package Array;

import java.util.*;
public class MaxSubArrayKadanesAlgor {
    public static void kadanes(int[] numbers){

        /* finding the maximum sum */
        int ms = Integer.MIN_VALUE;
        /* current sum is 0 declare  */
        int cs = 0 ;
 
        /*finding and logic using for loops using index and lengt h */
        for( int i=0; i<numbers.length; i++){
            /*cs = cs+numbers[i];
              cs = 0+(-2); //0 bcoz kadanes algoritm say that this if negative are the answer then we can change into postive number like putting (0)
             */
            cs = cs + numbers[i];
            ms =Math.max(cs, ms); 
            if( cs < 0){
                cs = 0;
            }
            
           
        }
        System.out.println("our max Subarray sum is " + ms);
    }

    public static void main(String[] args){
        int[] numbers = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);  //output is 7
    
    }
    
}
