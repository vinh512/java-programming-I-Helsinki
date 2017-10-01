import java.util.Scanner;

public class Factorial {
	
    public static void main(String[] args) {
    	
        Scanner reader = new Scanner(System.in);        
        int i = 1, factorial = 1;
        
        // enter a bound
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        // calculate factorial
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
