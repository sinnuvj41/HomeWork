import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Email: ");
        String email = sc.nextLine();

        System.out.print("Enter your Phone Number: ");
        String phone = sc.nextLine();

        // Validate Name
        if (name.matches("^[A-Z][a-zA-Z ]*$")) {
            System.out.println("Name is valid.");
        } else {
            System.out.println("Invalid Name! Name must start with a capital letter and contain only letters or spaces.");
        }

        // Validate Email
        if (email.contains("@") && email.contains(".")
                && !email.startsWith("@") && !email.startsWith(".")
                && !email.endsWith("@") && !email.endsWith(".")) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid Email! Email must contain '@' and '.', and must not start or end with them.");
        }

        // Validate Phone Number
        if (phone.matches("\\d{10}")) {
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Invalid Phone Number! It must contain exactly 10 digits.");
        }

        sc.close();
    }
}
