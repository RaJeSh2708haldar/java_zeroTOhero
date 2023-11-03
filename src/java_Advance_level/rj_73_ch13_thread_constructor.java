package java_Advance_level;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=56;
        System.out.println("Thank You");
    }
}
public class rj_73_ch13_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Rolex");
        MyThr t2 = new MyThr("Ram");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is: "+t1.getId());
        System.out.println("The name of the thread is: "+t1.getName());
        System.out.println("The id of the thread is: "+t2.getId());
        System.out.println("The name of the thread is: "+t2.getName());
        

    }
}
