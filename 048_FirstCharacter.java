import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        
        char firstChar = firstCharacter(name);
        System.out.println("First character: " + firstChar);
    }
    
    public static char firstCharacter(String name) {
        return name.charAt(0);
    }
}
