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
        
        System.out.print("Enter Student or Teacher: ");
        String role = s.nextLine();
        role = role.toLowerCase();
        
        
        System.out.print("What is your favorite number? ");
        int favNum = s.nextInt();

        
        
        
        if (role.equals("teacher")){
            System.out.println("Your new DOE username is "+ getInitial(firstName) + lastName + favNum + "@schools.nyc.gov");
        }
        else{
           System.out.println("Your new DOE username is " + firstName + getInitial(lastName) + favNum + "@nycstudents.net"); 
        }
        // test output
        generatePassword(8);
        
        
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

    /*
    * Name: generatePassword
    * Purpose: generte a random number
    // from 65-90 CAPITAL leters
    // from 97-122 Lowercase
    // form 33-47 for Special Characters
    
    //Convert the random int to char, ex c = (char)i;
    * Input: length
    * Return: a random password
    */
    public static String generatePassword(int length){
        String password ="" ;
        int max = 90;
        int min= 65;
        int rand =((int)(Math.random() *((max - min) +1) + min) );
        char c = (char)rand;
            
        
        for(int i=0; i < length; i++){
            rand =((int)(Math.random() *((max - min) +1) + min) );
            c = (char)rand;
            password += c;
        }
            
        
        
        System.out.println(password);
        return password;
    }// End of generatePassword method
} // end class