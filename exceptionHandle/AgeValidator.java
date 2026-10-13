package exceptionHandle;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class AgeValidator {

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Not eligible: Age must be 18 or above.");
        } else {
            System.out.println("Eligible!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
