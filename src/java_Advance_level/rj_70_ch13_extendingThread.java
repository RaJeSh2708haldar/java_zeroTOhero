package java_Advance_level;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100) {
            System.out.println("My thread1 is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<100) {
            System.out.println("My thread2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class rj_70_ch13_extendingThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
