public class swapping2number {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Approach 1 Swapping using a temporary variable means third variable is used to store the value of one of the variables while swapping
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("After swapping: a = " + a + ", b = " + b);

        // Approach 2 Swapping without using a temporary variable means we can swap the values of two variables without using a third variable
        //  a = a + b;
        //  b = a - b;
        //  a = a - b;
        //  System.out.println("After swapping: a = " + a + ", b = " + b);

        //approach 3 Swapping using multiplication and division means we can swap the values of two variables using multiplication and division operations
        // a = a * b;
        // b = a / b;
        // a = a / b;
        // System.out.println("After swapping: a = " + a + ", b = " + b);

         //approach 4 Swapping using XOR operator means we can swap the values of two variables using the bitwise XOR operator
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("After swapping: a = " + a + ", b = " + b);

        //approach 5 Swapping using a single line of code means we can swap the values of two variables in a single line of code using the comma operator
        b = (a + b) - ( a = b);
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
