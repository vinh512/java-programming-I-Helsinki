public class PrintingLikeBoss {

    public static void printStars(int amount) {
        for (int stars = 1; stars <= amount; stars++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for (int i = 1; i <= amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        int j = 1;
        
        while (i <= height) {
            printWhitespaces(height-i);
            printStars(i);
            i += 2;
            height++;
        }
        
        while (j <= 2) {
            printWhitespaces((height/2) - 2);
            printStars(3);
            j++;
        } 
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
