public class SubArray {
    public static void printSubArray(int numbers[]){
        int totalp =0;
        for( int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for( int j = i ; j< numbers.length ; j++){
                int end =j;
                for( int k = start ; k<=end ; k++){
                    System.out.print(numbers[k] + " ");
                    
                }
                totalp++;
               System.out.println(); 
            }
            System.out.println();

        }
        System.out.println("Total subArray is : " + totalp);
    }
    public static void main(String[] args) {
        
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }
}
