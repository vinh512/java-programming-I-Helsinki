import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int startNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        while (startNumber <= limit) {
            System.out.println(startNumber);
            startNumber++;
        }
    }
}
