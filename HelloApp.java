
public class HelloApp {
    public static void main(String[] args) {
        String greeting;
        if (args.length > 0) {
            StringBuilder namesBuilder = new StringBuilder();
  
            for (String name : args) {
                namesBuilder.append(name).append(", ");
            }

            String names = namesBuilder.substring(0, namesBuilder.length() - 2);
            greeting = "Hello, " + names + "!";
        } else {

            greeting = "Hello, World!";
        }
      
        System.out.println(greeting);
    }
}