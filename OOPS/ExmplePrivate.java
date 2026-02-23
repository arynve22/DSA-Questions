import java.util.*;

public class ExmplePrivate {
    
    private String name ; // declareig the data member PEIVATE
    private int rollno;  // declareig the data member PEIVATE

    //making the method to Setter
    public void setName(String newName){
        name = newName;
    }

    public void setRollno(int newRollno){
        rollno = newRollno;
    }

    public String getName(){
        return this.name;
    }

    //making the method to make a GETTER method
    public int getRollno(){
        return this.rollno;
    }
    

    public static void main (String[] args) {
        //taking class and make then the object then we can used that object make a multiple object making 
        ExmplePrivate S1 = new ExmplePrivate();

        //Student S1 = new Student();

       
        S1.setName("Aryan Verma");  //setname with aryan
        System.out.println(S1.getName());  // printing the value using gat data 

        S1.setRollno(14);   //setrollno with 14
        System.out.println(S1.getRollno());   //printing the value using getRollno 
    }
}
