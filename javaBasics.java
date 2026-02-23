import java.util.*;

public class javaBasics {  
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();

                  // Outer loops
         for ( int line =1; line <= n; line++){
                  //Inner Loops
            for ( int star =1 ; star<=line+2; star++){
            System.out.print(star);
            }
            System.out.println();
         }
      }  
   
   }