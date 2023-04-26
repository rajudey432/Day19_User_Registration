package practiceJAVA;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidationAllRule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(emailRegex);

        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid email address!");
        } else {
            System.out.println("Invalid email address. Please enter a valid email address that follows the format abc.xyz@bl.co.in");
        }
    }
}

