import java.util.Scanner;
/**
 * Write a description of class lanterFly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lanterFly
{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" The lanterfly is an invasive species and ");
        System.out.println(" is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("DO YOU EVEN CARE ABOUT THE PLANET ?!?");
            System.out.println("C'mon now you can do better.");
        } //End of If Statement
        else {
            System.out.print("Thanks for doing your part.");
            System.out.println("You're Amazing");
        } //End of Else Statement
        
    } //End of Main Method
    
}