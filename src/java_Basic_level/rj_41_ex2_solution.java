package java_Basic_level;

import java.util.Random;
import java.util.Scanner;
public class rj_41_ex2_solution {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissor
        System.out.println("Enter 0 for Rock, 1 for paper, 2 for scissor ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random= new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        }else if (userInput==0 && computerInput==2||userInput==1&&computerInput==0||userInput==2&&computerInput==1){
            System.out.println("YOU WIN!");
        }else{
            System.out.println("Computer WIN!");
        }
        System.out.println("computer choice: "+computerInput);
        if(computerInput==0){
            System.out.println("computer choice: rock");
        }else if(computerInput==1){
            System.out.println("computer choice: paper");
        }else if(computerInput==2){
            System.out.println("computer choice: scissor");
        }
    }
}
