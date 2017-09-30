import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // enter a number
        System.out.print("Until what? ");
        int num = Integer.parseInt(reader.nextLine());
        
        int i = 1, sum = 0;
        
        // sum the values until you reach the number
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
