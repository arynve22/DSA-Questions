
import java.util.*;

public class CharAtMethod {

    public static void CharPrintletter(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        String firstName="Aryan";
        String lastName = "Verma";
        String fullName = firstName + " " + lastName;

        //System.out.println(fullName.charAt(4));
        CharPrintletter(fullName);


   }

}
