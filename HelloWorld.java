public class HelloWorld {
    
    // Unused variable
    private static String unusedString = "This is never used";

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int usedVariable = 5;
        System.out.println("Used variable: " + usedVariable);
    }

    // Unused function
    private static void unusedFunction() {
        System.out.println("This function is never called.");
    }
}
