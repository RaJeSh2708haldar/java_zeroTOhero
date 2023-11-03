package java_Advance_level;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int NoOfGuesses=0;

    public int getNoOfGuesses() {
        return NoOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.NoOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number=rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean IsCorrectNumber(){
        NoOfGuesses++;
      if(inputNumber==number){
          System.out.printf(" yes you guessed it right, it was %d \n you guessed it in %d attempts",number,NoOfGuesses);
          return true;
      }else if (inputNumber<number){
          System.out.println("Too low...");
      }else if (inputNumber>number){
          System.out.println("Too high...");
      }
      return false;
    }
}
public class rj_50_ex03_solution {
    public static void main(String[] args) {
        //create a class game, which allows a user to play "guess the number" game once. game should have the number the following methods:
        //1.constructor to generate the random number
        //2.takeUserInput() to take a user input of number
        //3.isCorrectNumber() to detect whether the number entered by the user ture use properties such as noOfGuesses(int),etc to get
        //this task done!

        Game g = new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b = g.IsCorrectNumber();
        }
    }
}
