import java.util.Scanner;
import java.util.*;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        // create a char ArrayList
        // store the letters(char) of the String into the ArrayList<Character>
        // use Collections.reverse(ArrayList) on it
        // and use that value to compare it to the original
        // if equal, return true
        
        // helper variable used to store the reversed string
        String reversedString = "";
        
        // declare reference variable for char ArrayList
        ArrayList<Character> charList = new ArrayList<Character>();
        
        // iterate through the String dissecting & inserting each char into ArrayList
        for (int i = 0; i < text.length(); i++) {
            charList.add(text.charAt(i));
        }
        
        // uses Collection reverse method to reverse the elements in the ArrayList
        Collections.reverse(charList);
        
        // iterate through the ArrayList & construct the reversed chars into a String
        for (int i = 0; i < charList.size(); i++) {
            reversedString += charList.get(i);
        }
        
        // check to see if Strings are equal & returns boolean value
        return text.equals(reversedString); 
            
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
