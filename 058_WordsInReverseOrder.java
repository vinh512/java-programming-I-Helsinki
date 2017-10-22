import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if (word.equals("")) {
                Collections.reverse(wordList);
                System.out.println("You typed the following words: ");
                for (String item : wordList) {
                    System.out.println(item);
                }
                break;
            }
            // this is place after the if statement as to not include the empty string
            wordList.add(word);
        }
    }
}
