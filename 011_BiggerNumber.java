import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        double num1 = Double.parseDouble(reader.nextLine());
        
        System.out.print("Type another number: ");
        double num2 = Double.parseDouble(reader.nextLine());
        
        double biggerNum = Math.max(num1, num2);
        
        System.out.println("The bigger number of the two numbers given was: " + biggerNum);
    }
}
