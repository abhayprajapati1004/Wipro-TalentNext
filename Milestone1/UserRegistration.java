class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}


public class UserRegistration {
    public static void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        try {
            registerUser("Mickey", "US"); // This should throw an exception
            registerUser("Mini", "India"); // This should print "User registration done successfully"
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}