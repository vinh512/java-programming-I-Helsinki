import java.util.Scanner;

public class TheEndPart {
	
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        System.out.println("Length of the end part: ");
        int len = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + word.substring(word.length() - len));
    }
}
