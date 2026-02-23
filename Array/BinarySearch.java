public class BinarySearch {
    public static int binarySear(int numbers[] , int key){
        int start = 0 ;
        int end = numbers.length-1;

        while (start <= end) {
            /*finding the index of middle */
            int mid = (start + end) / 2;

            /*comparion  */
            if( numbers[mid] == key){
                return mid;
            }
               if( numbers[mid] < key ) { // condition is true search the elemet of the right 
                start = mid + 1;
                } 
                   else { //left side goes 
                      end = mid - 1;
                 }
        }
        return -1;
    }

    public static void main( String[] args){
        int numbers [] = {2,4,6,8,10,12,14};
        int key = 12;

        int result = binarySear(numbers, key);

        if(result == -1){
            System.out.println("index Element not found ");
        }else  {
            System.out.println("element found at index : " + result);
        }
    }
}
