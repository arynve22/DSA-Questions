import java.util.Scanner;

public class func{
    // public void printFunction(){
    //     System.out.println("Hello World");
    // }

    // public static void funWithoutpara(int num1, int num2){
    //     // Scanner sc= new Scanner(System.in);
    //     // int a =sc.nextInt();
    //     // int b =sc.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println("sum of two number"+sum);
    // }

    public static void swap( int num1, int num2){
        
        int temp = num1;
        num1=num2;
        num2=temp;
    
       System.out.println("A ="+ num1 );
       System.out.println("B ="+num2);
    }

    public static void main(String args[]){
    //     Scanner sc= new Scanner(System.in);
    //     int a =sc.nextInt();
    //     int b =sc.nextInt();
        
    //    funWithoutpara(a,b);
        int a= 10;
        int b=20;
        System.out.println("A="+a + "B="+b);
        swap(a,b);
        System.out.println("After swaping number" + "A="+a + "B="+b);    
    }  
}
