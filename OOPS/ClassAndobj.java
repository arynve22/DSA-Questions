public class ClassAndobj {
    public static void main(String args[]){
        //System.out.println("Hello World");
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

    }
}

class Pen {
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage ;

    void percentage( int maths, int phy , int chem){
        percentage = (maths + phy + chem )/3;
    }
}




