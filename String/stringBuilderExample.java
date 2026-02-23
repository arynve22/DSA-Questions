import java.util.*;
//now we start the data 
public class stringBuilderExample {
    public static void main(String[] args){
        //StringBuilder alwazz make a object and then 
        StringBuilder sb = new StringBuilder("");

        for( char ch = 'a'; ch <='z'; ch++){
            sb.append(ch);//append means that ,the data can add the first data
        }
        System.out.println(sb);
    }
}
