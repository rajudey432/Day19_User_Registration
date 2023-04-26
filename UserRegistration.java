package practiceJAVA;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(firstNameRegex);

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name. Please enter a string of minimum 3 characters starting with a capital letter.");
        }
    }
}