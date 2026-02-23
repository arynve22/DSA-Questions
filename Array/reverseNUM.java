import java.util.*;
public class reverseNUM {
    
    public static void reverseNumber(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while(first < last){
            //Swaping value 
            int temp = numbers[first];
            numbers[first]=numbers[last];
            numbers[last]= temp;
            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        reverseNumber(numbers);

        for(int i =0 ; i < numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
   System.out.println();
    }
    
}
