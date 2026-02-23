import java.util.*;

// creating interface 1
interface RemoteControl{
    void turnOn();// bydefault the take public abstract method withour any mentions
    void turnOff();
}

//implementing class 1
class TV implements RemoteControl {
    //public define is must complesily
    public void turnOn(){ //method of overriding we make to define in write public 
        System.out.println("TV is On");
    }
    public void turnOff(){
        System.out.println("TV is OFF");
    }
}

class AC implements RemoteControl {
    
    public void turnOn(){
        System.out.println("Ac is ON ");
    } 
    public void turnOff(){
        System.out.println("Ac is off");
    }
   
}

public class interfaceExample {
    public static void main(String[] args) {
        TV remoteTV = new TV();
        AC RemoteAC = new AC();
        RemoteAC.turnOff();
        RemoteAC.turnOn();
        remoteTV.turnOn();
    
        //    TV tv1 = new TV();
    //    tv1.trunOn();
    //    tv1.turnOff();

    }
}
