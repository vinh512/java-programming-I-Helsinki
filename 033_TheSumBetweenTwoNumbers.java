import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
	
    public static void main(String[] args) {
    	
        Scanner reader = new Scanner(System.in);        
        int sum = 0;
        
        // enter first bound
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
              
        // enter 2nd bound
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        
        // sum up values from first bound to 2nd bound
        while (first <= last) {
            sum += first;
            first++;
        }
        System.out.println("The sum is " + sum);        
    }
}
