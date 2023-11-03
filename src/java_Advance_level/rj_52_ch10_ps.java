package java_Advance_level;

class circle1{
    public int radius;

    public circle1(int radius) {
        System.out.println("I am circle constructor");
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double volume(){
        return 1.333* Math.PI*radius*radius;
    }
}
class cylinder1 extends circle1{
    public int height;

    public cylinder1(int radius, int height) {
        super(radius);
        System.out.println("I am cylinder constructor");
        this.height = height;
    }

    @Override
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    @Override
    public double area(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}

class Rectangle5{
    public int length;
    public int width;

    public Rectangle5(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}
class cuboid extends Rectangle5{
    int height;

    public cuboid(int height, int length,int width) {
        super (length,width);
        this.height = height;

    }
    public int volume(){
        return length*width*height;
    }
    @Override
    public int area(){
        return 2*length*width+2*length*height+2*height*width;
    }
}
class base7{
    int r;

    public base7(int r) {
        this.r = r;
    }
}
class derived3 extends base7 {
   int t;
   public derived3(int r, int t) {
        super(r);
        this.t = t;
    }
}
class derived9 extends derived3{
    int y;

    public derived9(int r, int t, int y) {
        super(r, t);
        this.y = y;
    }
    public int sum(){
        return r+t+y;
    }
}
public class rj_52_ch10_ps {
    public static void main(String[] args) {
        //problem 1.
        circle1 objc = new circle1(6);
        System.out.println(objc.volume());
        System.out.println(objc.area());
        cylinder1 wp = new cylinder1(8,2);
        System.out.println(wp.area());
        System.out.println(wp.volume());
        //problem 2.
       // Rectangle5 r = new Rectangle5(4,6);
       // System.out.println(g.area());
       // System.out.println(g.perimeter());

        //problem 3.
        // ans 1 problem

        //problem 4.
        /*Rectangle5 g =new Rectangle5();
        g.setLength(6);
        g.setWidth(5);
        System.out.println(g.getWidth());
        System.out.println(g.getLength());
        System.out.println(g.area());
        System.out.println(g.perimeter());*/

        cuboid c = new cuboid(4,3,2);
        System.out.println(c.volume());
        System.out.println(c.area());

        // problem 5.

        derived9 d = new derived9(5,6,8);
        System.out.println(d.sum());
    }
}
