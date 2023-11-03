package java_Advance_level;

class happy{
    String name;
    int id;
    int salary;
    public void nice(){
        System.out.println("My name is: "+name);
    }
    public int myid(){
        return id;
    }
    public int mySalary(){
        return salary;
    }

    static void telljoke(){
        System.out.println("igbkjgvkuyd");
    }

   /* public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setid(int i){
        this.id=i;
    }
    public int getid(){
        return id;
    }
    public void setsalary(int s){
        this.salary=s;
    }
    public int getSalary(){
        return salary;
    }*/
}

public class partice_oops {
    public static void main(String[] args) {
        happy h=new happy();
        h.name="raj";
        h.nice();
        h.id=34;
        System.out.println("my id is: "+h.myid());
        h.salary=23000;
        System.out.println("my salary is: "+h.mySalary());
        /*h.setName("raj");
        System.out.println("my name is: "+h.getName());
        h.setid(67);
        System.out.println("my id is: "+h.getid());
        h.setsalary(45000);
        System.out.println("my salary is: "+h.getSalary());*/
        h.telljoke();
    }
}
