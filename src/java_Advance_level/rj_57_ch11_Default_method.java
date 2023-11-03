package java_Advance_level;

interface Camera{
    void takeSnap();
    private void greet(){
        System.out.println("Good Morning");
    }
    void recordVideo();
   default void record4KVideo(){
       greet();
       System.out.println("Recording 4K video...");
   }
}

interface wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting... ");
    }
}
class MySmartPhone extends myCellPhone implements Camera,wifi{
   public void takeSnap(){
        System.out.println("Taking snap");
    }
    //@Override
   // public void record4KVideo(){
   //     System.out.println("taking snap and recording in 4k");
   // }
    public void recordVideo(){
        System.out.println("Taking record");
    }
    public String [] getNetwork(){
        System.out.println("Getting list of networks");
        String[] networklist = {"raju","pritam","raj"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class rj_57_ch11_Default_method {
    public static void main(String[] args) {
        MySmartPhone sp = new MySmartPhone();
        sp.record4KVideo();
       // sp.greet();  --->error
        String [] ar = sp.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }
    }
}
