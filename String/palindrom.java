import java.util.*;
public class palindrom {
    public static boolean isPalindrome(String str){
        
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                //we doesn't want to compare the string chararter 
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    String str = "racecar";
    System.out.println(isPalindrome(str));
  }  
}
