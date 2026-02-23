public class SearchSortedmatrixEmple {
    public static boolean SearchSorted(int matrix[][], int key){
        int row =0; 
        int col= matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Foundkey at (" + row + "," + col +")");
                return true;
            }
            //here check the value/ compare the value // key value < matric cell is grater than goes to the col--
             else if(matrix[row][col] >key){
                col--; //goes to the left hand side of the matrix 
             } else{
                row++;//goes to the bottom means right++ way to goes 
             }
        }
        System.out.println("key not found");
        return false;
        
    }   public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 33;
        SearchSorted(matrix, key);
}
}
