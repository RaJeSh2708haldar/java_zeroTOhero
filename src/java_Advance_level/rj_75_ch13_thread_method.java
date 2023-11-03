package java_Advance_level;
class MyNewThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<56666) {
            System.out.println("Thank You");
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank You harry");
        }
    }
}
public class rj_75_ch13_thread_method {
    public static void main(String[] args) {
        MyNewThr1 t1=new MyNewThr1();
        MyNewThr2 t2=new MyNewThr2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
