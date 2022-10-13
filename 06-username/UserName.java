 import java.util.Scanner;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    firstName = firstName.toLowerCase();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    lastName = lastName.toLowerCase();
    System.out.print("What is your favorite number? ");
    int favNum = s.nextInt();
    System.out.print("Enter Student or Teacher: ");
    String role = s.nextLine();
    role = role.toLowerCase();
    if (role.equals("teacher")){
        System.out.println("Your new DOE username is "+ getInitial(firstName) + lastName + favNum + "@schools.nyc.gov");
    }
    else{
       System.out.println("Your new DOE username is " + firstName + getInitial(lastName) + favNum + "@nycstudents.net"); 
    }
    // test output
    
    

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
