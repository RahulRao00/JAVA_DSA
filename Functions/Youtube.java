    import java.util.*;
   public class Youtube {
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // System.out.println("Welcome in ");
            System.out.print("Enter the email id : ");
            String id = sc.nextLine();

            System.out.print("Enter your password : ");
            String pass = sc.nextLine();

            validUser(id,pass);  // function calling for valid user verification
        }

        public static void validUser(String id, String pass) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Verify as a user, Enter the your password  : ");
            String password = sc.nextLine();
     
            if(pass.equals(password)) {
                System.out.println("You are good to go ! ");
                System.out.println(".............................................");
                System.out.println("Welcome buddy in the youtube ");
                
            }
            else{
                System.out.println("Wrong password ! please check your password ");
                validUser(id, pass);
            } 
        }
    }
