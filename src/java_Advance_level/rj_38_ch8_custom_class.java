package java_Advance_level;

class employee {
     int id;
     int salary;
     String name;
     public void PrintDetails() {
         System.out.println("my id is: "+id);
         System.out.println("my name is: "+name);

     }
     public int getSalary(){
         return salary;
     }
     public int getSalary1(){
         return salary;
     }
 }

public class rj_38_ch8_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee Raj=new employee();// instantiating a new employee object
        employee ram= new employee();
        //setting properties
        Raj.id=34;
        Raj.name="rolex";
        Raj.salary=24000;

        ram.id=12;
        ram.name="Ram Paul";
        ram.salary=20000;

        // printing properties
        // System.out.println(raj.id);
        //System.out.println(raj.name);

        Raj.PrintDetails();
        ram.PrintDetails();
        //int salary = raj.getSalary();
        // System.out.println(salary);
        //int salary1 = ram.getSalary1();
        //System.out.println(ram.getSalary1());

    }
}
