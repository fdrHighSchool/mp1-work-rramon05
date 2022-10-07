import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rng
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.println("What Mode do you want? \n Easy \n Medium \n Hard \n");
        String Mode= s.nextLine();
        System.out.println(Mode);
        
        int maximum;
        if (Mode.equals("Easy")) {
            System.out.println("Easy!");
            int maximum= 10;
        }//Close If Easy  
        else{ 
            if(Mode.equals("Medium")) {
            System.out.println("Medium!");
            int maximun= 50;
            }//Closes Medium
            else{
            System.out.println("Hard!");
            int maximum=100;
            } //Closes Else Hard
        }//Closes First Else
        
        
        int mysteryNumber = random.nextInt(maximum) + 1;; // place-holder for now
        
        System.out.println(mysteryNumber);
        
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt(); 
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
}// end class