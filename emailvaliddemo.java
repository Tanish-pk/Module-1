import java.util.Scanner;

public class emailvaliddemo{
    public static void validateEmail(String email) throws InvalidEmailException {
        // very simple validation: must contain '@'
        if (email == null || !email.contains("@")) {
            throw new InvalidEmailException("Invalid email: missing '@' symbol.");
        }
        // you can add more rules here (e.g., characters after @, domain checks)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        try {
            validateEmail(email);
            System.out.println("Email is valid.");
        } catch (InvalidEmailException iee) {
            System.out.println("Validation failed: " + iee.getMessage());
        } finally {
            sc.close();
        }
    }
}
