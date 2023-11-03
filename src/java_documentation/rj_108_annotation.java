package java_documentation;
@FunctionalInterface
interface myCompany{
    void thisMethod();
   // void thisMethod2();
}
class keypadPhone2{
    @Deprecated
    void sendMessage(){
        System.out.println("text message");
    }
}
class AndroidPhone extends keypadPhone2{
    @Override
    void sendMessage(){
        System.out.println("message send via whatsapp!");
    }
}


public class rj_108_annotation {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation2")
        AndroidPhone a=new AndroidPhone();
        a.sendMessage();

    }
}
