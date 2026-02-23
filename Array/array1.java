 import java.util.Scanner;

public class array1 {
    public static void main (String args[]){
        int marks[] = new int[50];

       /* taking input for the user */
        Scanner sc = new Scanner(System.in);
        
        /* user input declare in code  
        marks[0]=92;  //marks for DBMS
        marks[1]=88;  //marks for DSA 
        marks[2]=93;  //marks for OS  */
        
        /* run time taking input  */
        marks[0]= sc.nextInt();  //marks for DBMs
        marks[1]=sc.nextInt();   //marks for DSA 
        marks[2]=sc.nextInt();   //marks for OS 
       int persentage = (marks[0] + marks[1] + marks[2])/3;


        System.out.println("marks for DBMS : " + marks[0] );
        System.out.println("marks for DSA : " + marks[1] );
        System.out.println("marks for OS : " + marks[2] ); 
        System.out.println("persentge of total marks " + persentage + " %");
    }
    
}
