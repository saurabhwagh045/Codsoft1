
package codsoft;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * //@author Saurabh
 */
public class NumberGame{


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();


        int minimumRange = 1;
        int maxRange =100;
        int maxAttempts=10;
        int score=0;

        boolean playAgain= true;

        while(playAgain){
            int targetNumber = random.nextInt(maxRange -minimumRange+ 1)+minimumRange;
            int attempts=0;
            boolean   guessed=false;

            System.out.println("Welcome to the Number Guessing Game");
            System.out.println("i will picked a number between" +minimumRange+"and"+maxRange+".");

            while(!guessed && attempts < maxAttempts){
                System.out.print("Enter your guess ");
                int userGuess= scanner.nextInt();

                if(userGuess < targetNumber){
                    System.out.println("Too low! Try again.");
                    }else if(userGuess > targetNumber){
                    System.out.println("Too high! Try again.");
                    }else{
                        guessed = true;
                        score++;
                        System.out.println("Congratulations! you guessed the number "+ targetNumber+" in "+(attempts+1)+" attempts.");
                    }
                attempts++;

            }if(!guessed){
                System.out.println("Sorry ,you has used all your attempts.The Number was"+targetNumber+".");
            }
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
            }
        System.out.println("Thanks for playing ! Your total score is"+score+".");
        System.out.println("Design by saurabh wagh , please Visit again");

    }

}


















