
public class HelloApp {
    public static void main(String[] args) {
        String name;
        // Step 1: Check if a command-line argument was provided
        if (args.length > 0) {
            // Step 2: If argument exists, read name from args[0]
            name = args[0];
        } else {
            // Step 3: If no argument, use the default value "World"
            name = "World";
        }
        // Step 4: Display the personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}