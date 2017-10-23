import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            
            if (input.equals("")) {
            	// uses Collection's sort method to alphabetize the words
                Collections.sort(wordList);
                System.out.println("You typed the following words: ");
                for (String item : wordList) {
                    System.out.println(item);
                }
                break;
            }
            wordList.add(input);
        }
    }
}
