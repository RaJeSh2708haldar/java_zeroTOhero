package java_Advance_level;
class r1{
    public int x =5;
    protected int y = 56;
    int z=34;
    private int a = 4;

    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class r2 extends r1{
    public void math2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //System.out.println(a);
    }
}

public class rj_66_ch12_modifiers1 {
    public static void main(String[] args) {
        r1 t = new r1();
        //t.math1();

        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println(t.z);
        //System.out.println(t.a);
        r2 r= new r2();
        r.math2();
    }
}
