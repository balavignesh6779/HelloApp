
public class HelloApp {
    public static void main(String[] args) {
        String nameText;
        if (args.length > 0) {
            // Using StringBuilder to efficiently join names
            StringBuilder namesBuilder = new StringBuilder();
            for (String name : args) {
                // Add a comma and space before every name except the first one
                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }
            nameText = namesBuilder.toString();
        } else {
            nameText = "World";
        }
        // Display the final personalized greeting
        System.out.println("Hello, " + nameText + "!");
    }
}