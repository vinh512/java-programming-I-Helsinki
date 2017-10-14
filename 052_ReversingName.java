import java.util.Scanner;

public class ReversingName {
	
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("In reverse order: " );
        
        // - We initialize i to the length of the name but we need to subtract
        //   1 because of 0-based indexing
        // - We then check to see if the index is greater than zero which means
        //   that there are still letters of the name to iterate through
        // - Then print out each char at the given index
        // - Lastly, we decrement
        for (int i = name.length()-1; i >= 0 ; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
