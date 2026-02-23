public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE; //using this method finding the maximum Number of the value
         /* for i loop is START loops */
        for( int i = 0 ; i<numbers.length ; i++){
            int start = i;
                /* j loops for a End loops  */
            for( int j = i ; j< numbers.length ; j++){
                int end =j;
                currSum =0;  //currSum is 0
                
                /* This loops of calculating the vaole  */
                for( int k = start ; k<=end ; k++){ 
                    currSum += numbers[k];    
                }
               System.out.println(currSum);
               if(maxSum < currSum){ // compare all the value in (maxsum < currSum) is curSum is bigger than curSum store into the maxSum 
                maxSum = currSum;// curSum store into the MaxSum 
               } 
            }
        }
        System.out.println(" Max Sum = : " + maxSum);// out is (30) is maximum number the printing the MaxSum
    }
    public static void main(String[] args) {
        int[] numbers ={-2,1,-3,4,-1,2,1,-5,4};
        //int[] numbers = {1,-2,6,-1,3};
        maxSubArraySum(numbers);
    }
}

