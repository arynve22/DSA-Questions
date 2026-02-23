import java.util.*;
public class NumPalindrome {
    public static int Palindrome(int num){
        int ori = num;
       int reversed = 0 ;

       while(num>0){
        reversed = reversed*10 ;
        reversed +=num%10;
        num/=10;
       }

       if(ori == reversed) {
        System.out.println("palindrome");
       }else{
        System.out.println("Not Palindrome");
       }
       return reversed;
   }
       public static void main(String[] args) {
        

        int num = 1222;
        System.out.println(Palindrome(num));
    }
}
