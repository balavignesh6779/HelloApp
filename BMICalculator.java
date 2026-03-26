public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            heights[i] = input.nextDouble();

            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            double heightInMeters = heights[i] / 100.0;
            bmiValues[i] = weights[i] / (heightInMeters * heightInMeters);

            if (bmiValues[i] < 18.5) weightStatus[i] = "Underweight";
            else if (bmiValues[i] < 24.9) weightStatus[i] = "Normal";
            else if (bmiValues[i] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("Person %d: Height: %.1f cm, Weight: %.1f kg, BMI: %.2f, Status: %s\n",
                (i + 1), heights[i], weights[i], bmiValues[i], weightStatus[i]);
        }
        input.close();
    }
}