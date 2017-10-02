import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        
    	Scanner reader = new Scanner(System.in);
        int i = 0, sum = 0;
        
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        while (i <= n) {
            sum += Math.pow(2, i);
            i++;                
        }
        System.out.println("The result is " + sum);
    }
}
