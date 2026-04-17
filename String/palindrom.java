import java.util.*;
public class palindrom {
    public static boolean isPalindrome(String str){
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
               //System.out.println("Not Palindrome");
                //we doesn't want to compare the string chararter 
                return false ;
            }
        }
    
        //System.out.println("Palindrome");
        return true;
        

    }

  public static void main(String[] args) {
    String str = "racecar";
    System.out.println(isPalindrome(str));
     if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
  }  
}
