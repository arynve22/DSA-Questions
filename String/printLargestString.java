import java.util.*;
public class printLargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        //yaha per ham log word ko compare kar ke dekhte hai ki kaunsa word bada hai jo vi bada hai usko print karna hai jaise ke (mango) bada word hai to wohi print hoga 

        for(int i=1; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest =fruits[i];
            }
        }
        System.out.println(largest);
    }
}
