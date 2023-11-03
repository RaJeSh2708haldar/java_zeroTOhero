package java_Basic_level;
import java.util.Scanner;
public class rj_16_ch4_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int a = sc.nextInt();
        if(a>18){
            System.out.println("Yes boy you can drive");
        } else {
            System.out.println("no boy you can not drive");
        }
    }
}
