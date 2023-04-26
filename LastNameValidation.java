package practiceJAVA;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LastNameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(lastNameRegex);

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid last name!");
        } else {
            System.out.println("Invalid last name. Please enter a string of minimum 3 characters starting with a capital letter.");
        }
    }
}

