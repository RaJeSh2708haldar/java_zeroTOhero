package java_Basic_level;
import java.util.Scanner;
public class rj_18_ch4_else_if {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are now! adult");
                break;
            case 21:
                System.out.println("you are student life enjoy");
                break;
            case 24:
                System.out.println("you are joining the job");
                break;
            case 35:
                System.out.println("you are the family man");
                break;
            case 60:
                System.out.println("you are retired call this budhaaa!");
                break;
            default :
                System.out.println("Enjoy the life");

        }

       /* if(age>50){
            System.out.println("You are experience");
        } else if(age>40){
            System.out.println("You are semi-experience");
        } else if(age>30){
            System.out.println("You are semi semi experience");
        } else if(age>20){
            System.out.println("you are semi semi semi experience");
        } else {
            System.out.println("you are not experience");
        }*/
    }
}
