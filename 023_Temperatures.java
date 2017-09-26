import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter floating point numbers: ");
            double value = Double.parseDouble(reader.nextLine());
            
            if (value < -30 || value > 40) {
                System.out.println("temperature out of range");
            } else {
                Graph.addNumber(value);
            }
        }
        
        // Graph is used as follows:
        /*
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        */        
    }
}