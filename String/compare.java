import java.util.*;
public class compare {
    public static void main(String[] args) {
       String s1 = "Tony";
       String s2 = "Tony";
       String s3 = new String("Tony"); 
        
       //now here we compare the value to each
        if(s1 == s2){
            System.out.println("String are equal");
        }else{
             System.out.println("String are not equal");
        }
        //here s1 are not compare the string value of s3 bcoz here start
        if (s1 == s3){
             System.out.println("String are equal");
        }else{
             System.out.println("String are not equal");
        }

         if (s1.equals(s3)){
             System.out.println("String are equal");
        }else{
             System.out.println("String are not equal");
        }
    }
}
