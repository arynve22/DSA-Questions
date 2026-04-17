public class MaxPrefixSum {
    
    public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE; //using this method finding the maximum Number of the value
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for( int i = 1 ; i<prefix.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        /* for i loop is START loops */
        for( int i = 0 ; i<numbers.length ; i++){
            int start = i;
                /* j loops for a End loops  */
            for( int j = i ; j< numbers.length ; j++){
                int end =j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // currSum is the sum of the value of the array and minus the value of the array
                
               if(maxSum < currSum){ // compare all the value in (maxsum < currSum) is curSum is bigger than curSum store into the maxSum 
                maxSum = currSum;// curSum store into the MaxSum 
               } 
            }
        }
        System.out.println(" Max Sum = : " + maxSum);// out is (30) is maximum number the printing the MaxSum
    }
    public static void main(String[] args) {
        int[] numbers = {-2,-3,4,-1,-2,1,5,-3};
       // int[] numbers = {1,-2,6,-1,3};
        maxSubArraySum(numbers);
    }
}

