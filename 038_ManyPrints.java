import java.util.Scanner;

public class ManyPrints {
    
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        
        int i = 0;
        
        System.out.println("How many?");
        int number = Integer.parseInt(reader.nextLine());
        
        while (i < number) {
            printText();
            i++;
        }
    }
}