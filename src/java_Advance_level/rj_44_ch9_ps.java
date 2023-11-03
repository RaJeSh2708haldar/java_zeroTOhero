package java_Advance_level;

class cylinder{
    private int radius;
    private int height;

   /* public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }*/

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float area(){
        return 2*3.14f*radius*radius+2*3.14f*radius*height;
    }
    public float volume(){
        return 3.14f*radius*radius*height;
    }
}


class  Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class sphere{
    private float radius;

    public sphere(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float area(){
        return 4*3.14f*radius*radius;
    }
    public float volume(){
        return 1.333f*3.14f*radius*radius*radius;
    }
}




public class rj_44_ch9_ps {
    public static void main(String[] args) {
        //problem 1.
        cylinder mycylinder= new cylinder();
        mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());

        //problem 2.
        System.out.println(mycylinder.area());
        System.out.println(mycylinder.volume());

        //problem 3.
        // ans : 1

        //problem 4.
        Rectangle1 r = new Rectangle1();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        //problem 5.
        sphere s =new sphere(5);
        System.out.println(s.area());
        System.out.println(s.volume());
    }
}
