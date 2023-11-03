package java_Basic_level;
import java.util.*;
public class rj_java_ch2_ps {
    public static void main(String[] args) {
        //problem 1.
        // what will be the result of the following expression: float a=7/4*9/2;
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //problem 2.
        // write a java program to encrypt a grade by adding 8 to it.decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // decrypting the grade
         grade = (char)(grade - 8);
        System.out.println(grade);

        //problem 3.
        // use comparison operator to find out whether a given number is greater then the user entered number or not.
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);*/

        //problem 4.
        // write the following expression in a java program v2 - u2 / 2*a*s .
       /* int v = 2;
        int u = 3;
        int a = 6;
        int s = 4;
        int k = (v*v-u*u)/2*a*s;
        System.out.println(k);

        //problem 5.
        // find the value .
        int x =7;
        int a = x*49/x+35/7;
        System.out.println(a);*/

    }
}
