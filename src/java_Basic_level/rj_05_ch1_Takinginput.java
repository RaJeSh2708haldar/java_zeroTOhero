package java_Basic_level;
import java.util.Scanner;
public class rj_05_ch1_Takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number1:");
        //int a = sc.nextInt();
        float a =sc.nextFloat();
        System.out.println("Enter the number2:");
        // int b = sc.nextInt();
        float b= sc.nextFloat();
        //int sum=a+b;
        float sum = a+b;
        System.out.println("the sum is: "+sum);

        boolean b1= sc.hasNextInt();
        System.out.println(b1);

        String str= sc.next();
        System.out.println(str);

        //String name = sc.nextLine();
        //System.out.println(name);

    }
}
