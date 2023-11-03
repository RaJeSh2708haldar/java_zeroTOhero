package java_Advance_level;

interface Bicycle{
    int a = 78;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface rajBicycle{
    int b= 56;
    void blowHornk3g();
    void newHorn();
}
class HeroCycle implements Bicycle , rajBicycle{
  void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Apply speedup");
    }
    public void blowHornk3g(){
        System.out.println("khabi khusi khabi gum pee pee pee");
    }
    public void newHorn(){
        System.out.println("main hoon naa po po po");
    }
}
public class rj_55_ch11_interfaces {
    public static void main(String[] args) {
        HeroCycle h = new HeroCycle();
        h.applyBrake(2);
         // you can create properties in interfaces
        System.out.println(h.a);
         // you cannot modify the properties in interfaces as they are final
         // h.a=567;
        //System.out.println(h.a);


        h.blowHornk3g();
        h.newHorn();

    }
}
