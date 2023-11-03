package java_Basic_level;
import java.util.Scanner;

public class rj_java_ch4_ps {
    public static void main(String[] args) {
        //problem 1.
       /* int a =10;
        if(a>11){ //(a=11)
            System.out.println("i am 11");
        } else{
            System.out.println("i am not 11");
        }*/

        //problem 2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the physics number");
        float a1=sc.nextFloat();
        System.out.println("Enter the chemistry number");
        float b1=sc.nextFloat();
        System.out.println("Enter the mathematics number");
        float c1= sc.nextFloat();

        float avg=(a1+b1+c1)/3.0f;
        System.out.println("Total avg: "+avg);

        if(avg>=40 && a1>=33&& b1>=33&& c1>=33){
            System.out.println("congratulations!! you are pass");
        } else {
            System.out.println("sorry!! you are fail");
        }

        //problem 3.
        /*System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;
        if(income <2.5){
            tax =tax+ 0;
        }else if(income >2.5f&& income <=5f){
            tax = tax + 0.05f*(income -2.5f);
        }else if(income > 5f && income <=10.0f){
            tax = tax +0.05f*(5.0f - 2.5f);
            tax = tax + 0.2f*(income-5f);
        }else if (income>10.0f){
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax +0.2f*(10.0f-5f);
            tax = tax +0.3f*(income - 10.0f);
        }
        System.out.println("the total tax paid by the employee is: "+tax);*/

        //problem 4.
        /*System.out.println("Enter the day number: ");
        Scanner sc =new Scanner(System.in);
        int day= sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid input");
        }*/

        //problem 5.
       /* System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("Yes!! leap year");
        }else{
            System.out.println("No!! not leap year");
        }*/

        //problem 6.
        /*Scanner sc = new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("this is a organizational website");
        } else if(website.endsWith(".com")){
            System.out.println("this is a commercial website");
        } else if(website.endsWith(".in")){
            System.out.println("this is a indian website");
        }*/
    }
}
