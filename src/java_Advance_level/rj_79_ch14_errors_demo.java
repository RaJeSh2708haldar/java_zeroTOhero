package java_Advance_level;

import java.util.Scanner;

public class rj_79_ch14_errors_demo {
    public static void main(String[] args) {
        //Syntax error Demo
        //int a=9   //Error: No semicolon!
        // b=0;     //Error: b not declared!

        //Logical error Demo
        //write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for(int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        //Runtime error Demo
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}
