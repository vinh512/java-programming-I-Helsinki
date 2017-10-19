import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first word: ");
        String word1 = reader.nextLine();
        
        System.out.print("Type the second word: ");
        String word2 = reader.nextLine();
        
        // not equal to -1 means that it is found        
        if (word1.indexOf(word2) == -1) {
            System.out.println("The word '" + word2 + "' is not found in the '" + word1 + "'.");
        } else {    
            System.out.println("The word '" + word2 + "' is found in the '" + word1 + "'.");
        }
    }
}
