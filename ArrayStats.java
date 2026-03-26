public class ArrayStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size (min 2): ");
        int size = input.nextInt();

        if (size < 2) {
            System.err.println("Size must be at least 2.");
            return;
        }

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        input.close();
    }
}