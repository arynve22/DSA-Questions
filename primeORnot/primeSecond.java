import java.util.Scanner;

public class primeSecond {



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
         
         if( n== 2){
            System.out.println("n is Prime Number");
         }  else {
                boolean isPrime = true;
                for (int i = 2; i <= n/2 ; i++){
                    if( n % i == 0){
                        isPrime = false;
                    }
                }
                if (isPrime== true){
                    System.out.println("n: "+ n +" is a prime Number ");
                } else {
                    System.out.println("ln is a not a prime Number");
                }
        
         }

    }
    
}
