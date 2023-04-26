package practiceJAVA;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MobileNumberValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mobileRegex = "^\\d{2} \\d{10}$";
        Pattern pattern = Pattern.compile(mobileRegex);

        System.out.println("Please enter your mobile number:");
        String mobileNumber = scanner.nextLine();

        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid mobile number!");
        } else {
            System.out.println("Invalid mobile number. Please enter a mobile number in the format of 91 1234567890");
        }
    }
}