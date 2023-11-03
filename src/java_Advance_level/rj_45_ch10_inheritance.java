package java_Advance_level;

class base{
    int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printme(){

        System.out.println("I am a constructor");
    }
}

class derived  extends base{
    int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class raj1 extends derived{      // father
    int a;
    public raj1(int a) {
        this.a = a;
        System.out.println("this is number:"+a);
    }
}
class raju extends raj1{      //son
    int b;
    public raju(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("this is number: "+b);
    }
    public int sum(){
        return a+b;
    }
}
public class rj_45_ch10_inheritance {
    public static void main(String[] args) {

        // creating an object of base class     only for X     father
        /*base b = new base();
        b.setX(4);
        System.out.println(b.getX());*/

        // creating an object of derived class     x and y     son
       /* derived d= new derived();
        d.setY(6);
        System.out.println(d.getY());
        d.setX(5);
        System.out.println(d.getX());
        d.printme();

        //constructor inheritance----
        raju r = new raju(4,3);
        System.out.println(r.sum());*/


        raju r = new raju(4,7);
        r.setX(7);
        r.setY(6);
        System.out.println(r.getX());
        System.out.println(r.getY());
        System.out.println(r.sum());

    }
}
