package java_Advance_level;

class a{
    public int a;
    public int rajesh(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class a");
    }
}
class b extends a{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class b");
    }
    public void meth3(){
        System.out.println("I am method 3 of class b");
    }
}
class superClass{
    int f=6;
    int v=5;
    public void raj(){
        System.out.println("i am method raj");
    }
}
class subClass extends superClass {
    public int multi(){
        return f*v;
    }
    @Override
    public void raj(){
        System.out.println("i am subclass method");
    }
}

public class rj_48_ch10_method_overriding {
    public static void main(String[] args) {
        a A= new a();
        A.meth2();

        b B= new b();
       // B.meth3();
        B.meth2();

        a o = new b();
        // object run b is object
        o.meth2();

        superClass c = new superClass();
        c.raj();
        subClass s = new subClass();
        s.raj();
        System.out.println(s.multi());
    }
}
