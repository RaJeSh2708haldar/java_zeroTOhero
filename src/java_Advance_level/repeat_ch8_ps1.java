package java_Advance_level;
class company{
    int id;
    String name;
    int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }
}

class CellPhone{
    void Ringing(){
        System.out.println("ringing.....");
    }
    void Vibrating(){
        System.out.println("Vibrating...");
    }
}

class square5{
    int side;

    public square5(int side) {
        this.side = side;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle65{
    int length;
    int width;

    public Rectangle65(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}

public class repeat_ch8_ps1 {
    public static void main(String[] args) {

        company r =new company();
        r.setId(45);
        r.setName("Rohit");
        r.salary=700;
        System.out.println(r.getId());
        System.out.println(r.getSalary());
        System.out.println(r.getName());

       /* CellPhone c = new CellPhone();
        c.Ringing();
        c.Vibrating();*/

        square5 s =new square5(6);
        System.out.println(s.area());
        System.out.println(s.perimeter());

        Rectangle65 ri = new Rectangle65(5,8);
        System.out.println(ri.area());
        System.out.println(ri.perimeter());
        
    }
}
