package java_Advance_level;

class phone{
    public void showtime(){
        System.out.println("time is 8Am...");
    }
    public void on(){
        System.out.println("turn on phone...");
    }
}
class Smartphone1 extends phone{
    public void music(){
        System.out.println("playing music...");
    }
    @Override
    public void on(){
        System.out.println("turn on Smartphone...");
    }
}
public class rj_49_ch10_Dynamic_method_dispatch {
    public static void main(String[] args) {
        phone o = new phone();
        o.on();
        o.showtime();
        Smartphone1 so = new Smartphone1();
        so.on();
        so.music();

        phone oi = new Smartphone1();// it is allowed
       // Smartphone1 obj = new phone();  // not allowed
        oi.showtime();
        oi.on();   // object run    (Smartphone1 run)

       // oi.music();    //not allowed
    }
}
