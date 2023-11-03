package java_Advance_level;
@FunctionalInterface
interface myFactionalInterface{
    void thisMethod();
   // void thisMethod2();
}
class KeypadPhone extends phone{
    @Override
    public void showtime() {
        System.out.println("time is 8 pm");

    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class rj_108 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        KeypadPhone k=new KeypadPhone();
        k.showtime();
        k.sum(7,9);
    }
}
