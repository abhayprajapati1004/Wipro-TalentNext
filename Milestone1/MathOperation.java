public class MathOperation {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Exactly 5 integers are required.");
            }

            int[] numbers = new int[5];
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            double average = (double) sum / numbers.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter integers only.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}