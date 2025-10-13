class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age >= 60) {
            throw new InvalidAgeException("Age must be between 18 and 60");
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide name and age as arguments");
            return;
        }

        String name = args[0];
        try {
            int age = Integer.parseInt(args[1]);
            validateAge(age);
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}