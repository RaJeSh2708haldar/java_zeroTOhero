package java_Advance_level;
interface Camera2{
    void takeSnap();
    void recordVideo();
}

interface wifi2{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting... ");
    }
}
class MySmartPhone2 extends myCellPhone2 implements Camera2,wifi2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
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
    public void sampleMeth(){
        System.out.println("meth");
    }
}
public class rj_59_ch11_polymorphism {
    public static void main(String[] args) {
     Camera2 cam = new MySmartPhone2();   //this is a smartphone but, use it as a camera
     cam.recordVideo();
    // cam.getNetwork();  --> not allowed
       // cam.sanpleMeth();  -->not allowed
        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetwork();
        s.callNumber(526);
    }
}
