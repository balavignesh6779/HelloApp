public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        long tempNumber = Math.abs(number);

        int count = 0;
        long temp = tempNumber;
        if (temp == 0) count = 1;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = tempNumber;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            int digitValue = digits[i];
            frequency[digitValue]++;
        }

        System.out.println("\nDigit Frequency Report for: " + number);
        System.out.println("------------------------------------");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

        input.close();
    }
}