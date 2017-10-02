import java.util.Scanner;

public class LoopsEndingRemembering {
	
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int sum = 0, numberCount = 0;
        int evenCount = 0, oddCount = 0;
        int number;
        double average = 0.0;
        
        while(true) {
            System.out.print("Type numbers: ");
            number = Integer.parseInt(reader.nextLine());
                        
            if (number == -1) {
                break;
            }
                        
            if (number % 2 == 0) {
                evenCount++;
            } else 
                oddCount++;
            
            numberCount++;
            sum += number;
            average = (double) sum / numberCount; 
        }
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numberCount);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
