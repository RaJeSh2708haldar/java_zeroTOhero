package java_Advance_level;

abstract class pen {
   abstract public void write();
   abstract public void refill();
}
class FountainPen extends pen{
    public void  write(){
        System.out.println("write...");
    }
    public void refill(){
        System.out.println("Black refill");
    }
    public void changeNib(){
        System.out.println("ChangeNib..");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void Jump(){
        System.out.println("jumping...");
    }
    void Bite(){
        System.out.println("biting..");
    }
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir");
    }
   @Override
   public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping...");
    }
}
public class rj_60_ch11_ps {
    public static void main(String[] args) {
        //problem 1.

       // pen p = new FountainPen();
       // p.refill();
       // p.write();
        FountainPen g = new FountainPen();
        g.changeNib();
        g.write();
        g.refill();

        //problem 2.
        // ans 1.

        //problem 3.
        Human raj = new Human();
        raj.sleep();
        raj.eat();

        //problem 5.
        Monkey m1 = new Human();
        m1.Bite();
        m1.Jump();
       // m1.speak();   --->cannot use speak method becouse the reference is monkey which does not have speak method

       BasicAnimal b1 = new Human();
       b1.eat();
       b1.sleep();
      // b1.speak();  -->error

    }
}
