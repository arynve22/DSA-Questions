import java.util.*;
//2D array representation  
public class MatrixArray {

    public static boolean search(int matrix[][],int keys){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              
                if(matrix[i][j] == keys ){
                    System.out.println("Found index at cell ("+ i + ","+ j + ")") ;
                }
            }
    }
    System.out.println("Keys not found");
    return false;
    
    
}

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

    //for taking input to the data in 2D array n*m
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        search(matrix, 6);  
    }
    
}
