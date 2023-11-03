package java_Basic_level;

public class rj_08_ch2_operators {
    public static void main(String[] args) {
         //1.arithmetic operator
        int a=2;
         // int b=2*a;// 2-a,2+a;2/a
         // int b=9%a;  // modulo operator
        //2.assignment operator
        int b = 7;
        b+= 5; //b*=7
        System.out.println(b);
        //3.comparison operator
        System.out.println(6==6);
        System.out.println(2<4);
        //4.logical operator
        System.out.println(6<4 && 8>5);
        System.out.println(8<4 || 8>2);
    }
}
