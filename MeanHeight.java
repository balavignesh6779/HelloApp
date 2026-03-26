public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.printf("The mean height of the team is: %.2f\n", mean);
        input.close();
    }
}