package java_Basic_level;
import java.util.Scanner;
public class rj_06_ch1_result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bengali number:");
        float a1=sc.nextFloat();
        System.out.println("English number:");
        float a2=sc.nextFloat();
        System.out.println("Mathe number:");
        float a3=sc.nextFloat();
        System.out.println("Physics number:");
        float a4=sc.nextFloat();
        System.out.println("Computer number");
        float a5=sc.nextFloat();

        float percentage=(a1+a2+a3+a4+a5)/5.0f;
        System.out.println("The percentage is:"+percentage);
    }
}
