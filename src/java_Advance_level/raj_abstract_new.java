package java_Advance_level;

abstract class Bird{
    abstract public void BirdSound();
    public void sleep(){
        System.out.println("Azzz...");
    }
}
class parrot extends Bird{
    public void BirdSound(){
        System.out.println("The parrot:Bzz..");
    }
}

abstract class RBI{
    abstract public int getRateOfInterest();
}
class CBN extends RBI{
    @Override
    public int getRateOfInterest(){
        return 6;
    }
}
class KNB extends RBI{
    @Override
    public int getRateOfInterest(){
        return 9;
    }
}

abstract class parent4{
   abstract public void message();
}
class subParent extends parent4{
    public void message(){
        System.out.println("The first Subclass");
    }
}
class twoSubClass extends parent4{
    public void message(){
        System.out.println("The second subclass");
    }
}

abstract class Bank{
    abstract public int getBalance();
}
class BankA extends Bank{
    @Override
    public int getBalance(){
        return 100;
    }
}
class BankB extends Bank{
    @Override
    public int getBalance(){
        return 150;
    }
}
class BankC extends Bank{
    @Override
    public int getBalance(){
        return 200;
    }
}

abstract class shape{
    abstract public void area();
    double area;
    abstract public void perimeter();
    double perimeter;
}
class circle67 extends shape{
    double r = 5;
    @Override
    public void area(){
        area= Math.PI*r*r;
        System.out.println(area);
    }
    @Override
    public void perimeter(){
         perimeter= 2*Math.PI*r;
        System.out.println(perimeter);
    }
}
class Rectangle678 extends shape{
    double l =4;
    double w=5;
    @Override
    public void area(){
        area=l*w;
        System.out.println(area);
    }
    @Override
    public void perimeter(){
        perimeter=2*(l+w);
        System.out.println(perimeter);
    }
}
class rhombus extends shape{
    double p=8;
    double q=2;
    double s=6;
    @Override
    public void area(){
        area=(p*q)/2;
        System.out.println(area);
    }
    @Override
    public void perimeter(){
        perimeter=4*s;
        System.out.println(perimeter);
    }
}


public class raj_abstract_new {
    public static void main(String[] args) {
        /*parrot p = new parrot();
        p.BirdSound();
        p.sleep();

        RBI u= new CBN();
        System.out.println("The Interest is:"+u.getRateOfInterest()+"%");
        RBI t = new KNB();
        System.out.println("The Interest is:"+t.getRateOfInterest()+"%");

        parent4 s = new subParent();
        s.message();
        parent4 y = new twoSubClass();
        y.message();

        Bank w = new BankA();
        System.out.println("$"+w.getBalance());
        Bank q = new BankB();
        System.out.println("$"+q.getBalance());
        Bank r = new BankC();
        System.out.println("$"+r.getBalance());*/

        circle67 j = new circle67();
        j.area();
        j.perimeter();

        Rectangle678 r = new Rectangle678();
        r.area();
        r.perimeter();

        rhombus t = new rhombus();
        t.area();
        t.perimeter();
    }
}
