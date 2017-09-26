import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        System.out.print("Type the password: ");
        String userPassword = reader.nextLine();
        
        while (!userPassword.equals(password)) {
            System.out.println("Wrong!");
            System.out.print("Type the password: ");
            userPassword = reader.nextLine();
            
            if (userPassword.equals(password)) {
                break;
            }
        }
        System.out.println("Right!");
        System.out.println("The secret is: good jerb");
    }
}
