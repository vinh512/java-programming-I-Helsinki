import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points: ");
        int points = reader.nextInt();
        
        if (points <= 29) {
            System.out.println("Grade: failed");
        } else if (points >= 30 & points <= 34) {
            System.out.println("Grade: 1");
        } else if (points >= 35 & points <= 39) {
            System.out.println("Grade: 2");
        } else if (points >= 40 & points <= 44) {
            System.out.println("Grade: 3");
        } else if (points >= 45 & points <= 49) {
            System.out.println("Grade: 4");
        } else if (points >= 50 & points <= 60) {
            System.out.println("Grade: 5");
        }
    }
}
