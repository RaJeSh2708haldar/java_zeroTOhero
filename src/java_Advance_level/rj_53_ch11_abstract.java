package java_Advance_level;

abstract class parent {
    public parent() {
        System.out.println("I am parent constructor");
    }

    public void sayHeloo() {    //method
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

}
    class child extends parent {
        @Override
        public void greet(){
            System.out.println("Good Morning");
        }
        @Override
        public void greet2(){
            System.out.println("Good afternoon");
        }
    }

    abstract class child2 extends parent {
    public void rd(){
        System.out.println("I am good boy");
    }
    }

public class rj_53_ch11_abstract {
    public static void main(String[] args) {
       // parent p = new parent();    ---> error
        child c = new child();
        //child2 c2 = new child2();   ---->error
        c.greet();
        c.greet2();


    }
}
