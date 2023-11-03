package java_Advance_level;

interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface{
    void math3();
    void math4();
}
class MySampleClass implements childSampleInterface{
    public void math1(){
        System.out.println("math1");
    }
    public void math2(){
        System.out.println("math2");
    }
    public void math3(){
        System.out.println("math3");
    }
    public void math4(){
        System.out.println("math4");
    }
}
public class rj_58_ch11_inheritance_interfaces {
    public static void main(String[] args) {
        MySampleClass ms=new MySampleClass();
        ms.math1();
        ms.math2();
        ms.math3();
        ms.math4();

    }
}
