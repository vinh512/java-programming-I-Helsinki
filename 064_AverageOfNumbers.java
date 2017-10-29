import java.util.ArrayList;

public class AverageOfNumbers {

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer val : list) {
            sum += val;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list) {        
        double average = 0.0;
        // note that we casted to double because the return type takes a double
        average = (double) sum(list) / list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        // we can also initialize an ArrayList literal like:
        // List<Integer> list = {3, 2, 7, 2};

        System.out.println("The average is: " + average(list));
    }
}