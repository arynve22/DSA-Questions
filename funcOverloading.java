public class funcOverloading {
    
    public static int sum (int a , int b){
        return a+b;
    }

    public static int sum( int a , int b , int c){
        return a+b+c;
    }
    
   public static double sum(double a, double b ,double c){
        return a+b+c;
    }
    public static void main(String args[]){
        // funcOverloading obj = new funcOverloading();
        // int sum1 =obj.sum(4,6);
       // System.out.println(sum1());
        System.out.println(sum(5,6));
        System.out.println(sum(7.55,8.44,5.44));      
    }

}
