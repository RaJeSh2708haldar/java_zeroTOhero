package java_Advance_level;

class employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}


class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("calling ram...");
    }
}



class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}



class rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}



class Tommy_vecetti{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("Running form the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}



class circle{
    float radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}

/*class circle1{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
}*/


public class rj_39_ch8_ps {
    public static void main(String[] args) {
        //problem 1.
        employee1 raj=new employee1();
        raj.setName("rolex");
        raj.salary=3600;
        System.out.println(raj.getSalary());
        System.out.println(raj.getName());

        //problem 2.
        cellphone asus = new cellphone();
        asus.ring();
        asus.vibrate();
        asus.callFriend();

        //problem 3.
        square sq = new square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //problem 4.
        rectangle rg = new rectangle();
        rg.length = 5;
        rg.width = 3;
        System.out.println(rg.area());
        System.out.println(rg.perimeter());

        //problem 5.
        Tommy_vecetti player = new Tommy_vecetti();
        player.run();
        player.hit();
        player.fire();

        //problem 6.
        circle ce=new circle();
        ce.radius=4;
        System.out.println(ce.area());
        System.out.println(ce.perimeter());

    }
}
