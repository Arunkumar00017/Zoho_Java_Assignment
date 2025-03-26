import java.util.Scanner;

public class Ass6Prob4 {
    public static boolean isValidEmail(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);
        int dotIndex = domainPart.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == 0 || dotIndex == domainPart.length() - 1) {
            return false;
        }
        if (localPart.isEmpty()) {
            return false;
        }
        if (domainPart.length() < 3) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        scanner.close();
        if (isValidEmail(email)) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
    }
}
