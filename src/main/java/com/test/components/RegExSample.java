package com.test.components;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSample {
    public static void run() {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

    public static void SampleEmailChecker(String[] args) {
        // 1. Validate Email Address
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String email1 = "user@example.com";
        String email2 = "user@com";

        System.out.println("Email Validation:");
        validatePattern(emailRegex, email1);  // Valid
        validatePattern(emailRegex, email2);  // Invalid

        // 2. Validate Phone Number
        String phoneRegex = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";  // Optional country code, followed by 10 digits
        String phone1 = "+1-8005551234";
        String phone2 = "800-555-123";

        System.out.println("\nPhone Number Validation:");
        validatePattern(phoneRegex, phone1);  // Valid
        validatePattern(phoneRegex, phone2);  // Invalid

        // 3. Extracting Specific Information: Extracting Dates
        String dateRegex = "(\\d{2})/(\\d{2})/(\\d{4})";  // Matches dates in format "dd/mm/yyyy"
        String text = "Today's date is 14/01/2025. Another date is 01/12/2024.";

        System.out.println("\nExtracting Dates:");
        extractPattern(dateRegex, text);
    }

    // Method to validate input string against a regex pattern
    public static void validatePattern(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid input: " + input);
        } else {
            System.out.println("Invalid input: " + input);
        }
    }

    // Method to extract matching patterns from a text
    public static void extractPattern(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find all matches
        while (matcher.find()) {
            System.out.println("Found date: " + matcher.group(0));  // Entire match
            System.out.println("Day: " + matcher.group(1));          // Day (group 1)
            System.out.println("Month: " + matcher.group(2));        // Month (group 2)
            System.out.println("Year: " + matcher.group(3));         // Year (group 3)
        }
    }
}
