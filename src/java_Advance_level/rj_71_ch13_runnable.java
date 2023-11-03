package java_Advance_level;
class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("I am thread 1 not a thread");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        /*int i=0;
        while(i<10) {
            System.out.println("I am thread 2 not a thread");
            i++;
        }*/
        for(int i=0;i<10;i++){
            System.out.println("i am rajesh");
        }
    }
}
public class rj_71_ch13_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 m1 = new MyThreadRunnable1();
        Thread t1=new Thread(m1);

        MyThreadRunnable2 r1 = new MyThreadRunnable2();
        Thread t2=new Thread(r1);

        t1.start();
        t2.start();
    }
}
