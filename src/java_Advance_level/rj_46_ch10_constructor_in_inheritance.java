package java_Advance_level;

class base1{
    base1(){
        System.out.println("I am a constructor");
    }
   public base1(int x) {
        System.out.println("I am a overloaded constructor with value of x as: " + x);
    }
}

class derived1 extends base1 {
    derived1() {
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of derived with value of y as: "+y);
    }
}

class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of derived with value of z as: "+z);
    }
}

public class rj_46_ch10_constructor_in_inheritance {
    public static void main(String[] args) {
       // base1 b=new base1();
       // derived1 d =new derived1();
        //derived1 d =new derived1(34,7);
        childOfDerived c = new childOfDerived(7,45,54);
    }
}
