package java_Advance_level;

class faltu{
    int r;
    int d;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

class MyCompany{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        System.out.println("I am a constructor");
        this.a = a;
    }
}
class NewCompany extends MyCompany{
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        System.out.println("I am b constructor");
        this.b = b;
    }
}
public class rj_new_partice {
    public static void main(String[] args) {
        faltu f = new faltu();
        f.setR(34);
        f.setD(500);
        System.out.println(f.getR());
        System.out.println(f.getD());

        NewCompany c = new NewCompany();
        c.setA(56);
        c.setB(500);
        System.out.println(c.getA());
        System.out.println(c.getB());
    }
}
