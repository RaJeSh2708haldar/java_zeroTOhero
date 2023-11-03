package java_Advance_level;
class par13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good morning");
        }
    }
}
class par13a extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}
public class rj_76_ch13_ps {
    public static void main(String[] args) {
       // problem 1.
        par13 p1 =new par13();
        par13a p2 = new par13a();
        p1.start();
        p2.start();

    }
}
