import java.util.*;
public class SubString {

    public static String subString(String str,int si,int ei){
        // = startIndex ; // = endingIndex
        String Substr="";
        for(int i=si;i<ei;i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
       System.out.println( subString(str, 0, 8));
    }
}
