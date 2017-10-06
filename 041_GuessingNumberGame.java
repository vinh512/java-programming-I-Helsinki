import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {        
    	Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessCount = 0;
        
        while (true) {
            System.out.print("Guess a number: ");
            int guessNum = Integer.parseInt(reader.nextLine());
            guessCount++;

            if (guessNum == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                return;
            } else if (guessNum > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guessCount);
            } else {
                System.out.println("The number is greater, guesses made: " + guessCount);
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
