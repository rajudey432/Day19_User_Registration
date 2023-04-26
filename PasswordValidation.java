package practiceJAVA;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordRegex = "^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);

        System.out.println("Please enter your password:");
        String password = scanner.nextLine();

        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password. Please enter a password that is at least 8 characters long and contains at least one letter and one digit.");
        }
    }
}
