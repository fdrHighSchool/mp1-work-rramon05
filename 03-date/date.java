import java.util.Scanner;
/**
 * Think Java; Chapter 2, Exercise 2.With input.
 *
 * @author (Randy Ramon)
 * @version (9/28/22)
 */


public class date
{
    public static void main(String[]args) {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter the day of the week: ");
        String day = s.nextLine();
        
        System.out.println("Enter Month");
        String month = s.nextLine();
        
        System.out.println("Enter Year");
        String year = s.nextLine();
        
        System.out.println("Enter the day of the month");
        String date = s.nextLine();
        
        System.out.println("American Format: "+day+", " +month+" "+date+", "+year);
        System.out.println("European Format: "+day +" "+date+" "+month+" "+year);
        
        s.close(); //Closes Scanner
        
    } //End of Main Method
}
