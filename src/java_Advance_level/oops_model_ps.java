package java_Advance_level;

class puchi {
    int id;
    int salary;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


class tini{
    public String name;
    public int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class SmartPhone{
    public void music(){
        System.out.println("I am hero");
    }
    public void call(){
        System.out.println("Calling rolex...");
    }
}

class MyEmployee1{
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyEmployee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class rajesh1{
    int id;
    String name;

    public rajesh1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class oops_model_ps {
    public static void main(String[] args) {
        puchi p = new puchi();
        p.setId(7);
        p.setSalary(45000);
        p.setName("rolex with joint");
        System.out.println(p.getId());
        System.out.println(p.getSalary());
        System.out.println(p.getName());

        tini t = new tini();
        t.setName("tanisha");
        System.out.println(t.getName());
        t.setSalary(45000);
        System.out.println(t.getSalary());

        SmartPhone s = new SmartPhone();
        s.call();
        s.music();

        MyEmployee1 e= new MyEmployee1(45,"Rahul");
        System.out.println(e.getId());
        System.out.println(e.getName());

        rajesh1 r = new rajesh1(45,"king of tiger");
        System.out.println(r.getId());
        System.out.println(r.getName());

    }
}
