import java.util.ArrayList;
import java.util.List;

public class PerformanceIssuesExample {

    // Unused variable
    private static String unusedVariable = "This variable is never used";

    public static void main(String[] args) {
        // Inefficient use of collections
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
        }
        
        // Unnecessary object creation inside loops
        for (Integer number : numbers) {
            String message = new String("Processing number: " + number);
            System.out.println(message);
        }

        // Inefficient String concatenation in loops
        String concatenatedString = "";
        for (int i = 0; i < 100; i++) {
            concatenatedString += Integer.toString(i); // Using String concatenation in a loop
        }

        // Poor use of data structures
        List<Integer> searchList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            searchList.add(i);
        }

        // Inefficient searching
        if (searchList.contains(99999)) {
            System.out.println("Found 99999!");
        }
    }

    // Unused method
    private static void unusedMethod() {
        System.out.println("This method is never called.");
    }
}
