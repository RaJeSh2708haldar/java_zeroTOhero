package java_Advance_level;

class update{
    public int a;
    public int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum(){
        return a+b;
    }
}

class update2 extends update{
    public int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int sum2(){
        return a+b+c;
    }
}
public class A_L_PROJECT {
    public static void main(String[] args) {
       /* update u= new update();
        u.setA(8);
        u.setB(5);
        
        System.out.println(u.getA());
        System.out.println(u.getB());
        System.out.println("the sum: "+u.sum());*/

        update2 t = new update2();
        t.setC(67);
        t.setA(6);
        t.setB(9);
        System.out.println(t.getA());
        System.out.println(t.sum2());

    }
}
