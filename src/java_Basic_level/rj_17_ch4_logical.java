package java_Basic_level;

public class rj_17_ch4_logical {
    public static void main(String[] args) {
        System.out.println("Logical AND operator");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a&& b&& c){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(" Logical OR operator");
        boolean a1= true;
        boolean b1 = false;
        boolean c1= false;
        if(a1||b1||c1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("Logical NOT operator");
        boolean x=true;
        boolean y=false;
        System.out.println("NOT(x) is : "+!x);
        System.out.println("NOT(y) is : "+!y);
    }
}
