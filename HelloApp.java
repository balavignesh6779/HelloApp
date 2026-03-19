public class HelloApp {
    public static void main(String[] args) {
        String finalNames;
        // Step 1: Check if command-line arguments were provided
        if (args.length > 0) {
            // Step 2 & 3: Join all names in the array with a comma and a space
            finalNames = String.join(", ", args);
        } else {
            // Step 4: Use default value if the array is empty
            finalNames = "World";
        }
        // Step 5: Display the single greeting with all names
        System.out.println("Hello, " + finalNames + "!");
    }
}