package java_Advance_level;
class vehicle{
    public void race(){
        System.out.println("raceing....");
    }
}
class car extends vehicle{
    public void superFirst(){
        System.out.println("400 km super speed");
    }
}

class sum{
    public int a=9;
    public int b=4;
    public int puls(){
        return a+b;
    }
}
class guna extends sum{
    public int multi(){
        return a*b;
    }
}
public class raj_inheritance{
    public static void main(String[] args) {
        car c = new car();
        c.race();
        c.superFirst();

        guna g =new guna();
        System.out.println(g.puls());
        System.out.println(g.multi());
    }
}
