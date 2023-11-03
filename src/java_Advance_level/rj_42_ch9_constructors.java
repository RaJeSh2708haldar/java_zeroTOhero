package java_Advance_level;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public MyMainEmployee(){
        id=12;
        name="Rajesh";
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}
public class rj_42_ch9_constructors {
    public static void main(String[] args) {
        MyMainEmployee boss= new MyMainEmployee();
        // boss.setName("rolex");
        //boss.setId(5);
        System.out.println(boss.getName());
        System.out.println(boss.getId());
    }
}
