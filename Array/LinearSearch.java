import java.util.*;

public class LinearSearch {
 
        /*Creating a function of Linears Search of the index Element */
    public static int linearSer(int numbers[], int key ){
        for(int i=0; i<numbers.length ; i++){
            if( numbers[i] == key){
                return i;
            }
           
        }
        return -1;
    }
        public static void main (String[] args){
            int numbers[] = {2,4,6,8,10,12,14,16};
            int key =10;
            int result= linearSer(numbers, key);

            /*print the element found or not found  */
            if(result == -1){
                System.out.println("Not found");
            }else {
                System.out.println("key is at index: "+ result);
            }
        }
    }




    
        
    

