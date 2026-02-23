import java.util.*;
//most importance topic to done with Spiral Matrix 
public class spiralMatrix {
    public static void PrintSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow <=endRow && startCol <= endCol){
            //find the top border of the startcolumn to endcolumn 
            for(int j=startCol; j<+ endCol;j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right border of the startRow to the EndRow 
            for(int i=startRow+1 ; i<=endRow ; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //botton border means it's a down side endColumn-1 to the StartColumn 
            for(int j = endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //Left border means it's left side of the border to the endRow-1 to the startRow + 1
            for(int i=endRow-1 ; i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
      
   PrintSpiral(matrix);     
    }
}
