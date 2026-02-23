import java.util.*;

public class factorail {

    public static int fact(int n){

        int f=1;

        for(int i = 1; i <= n ; i++){
            f = f * i ;
        }
        return f; //factorail calling
    }

    public static void main (String args[]){
         System.out.println("factorail of 4 is : "+ fact(4));
    }

}