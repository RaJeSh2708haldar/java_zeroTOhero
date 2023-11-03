package java_Advance_level;
class myEmployee{
    private int id;
    private String name;
   public myEmployee(int myId,String myName){
       id=myId;
       name=myName;
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
public class rj_40_ch9_modifiers {
    public static void main(String[] args) {
        myEmployee rolex =new myEmployee(67,"rolex");
       // rolex.id=56;
       // rolex.name="rajesh";    private error modifier
        //rolex.setName("rajesh");
        //System.out.println(rolex.getName());

        //rolex.setId(7);
        System.out.println(rolex.getId());
        System.out.println(rolex.getName());
    }
}
