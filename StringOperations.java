import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Convert the string to uppercase
        String upperCaseString = input.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);

        // 2. Find the length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // 3. Replace a character with another
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);
        String replacedString = input.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replacedString);

        // 4. Extract a substring
        System.out.print("Enter the starting index for the substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index for the substring: ");
        int endIndex = scanner.nextInt();

        // Check if indices are valid
        if (startIndex >= 0 && endIndex <= input.length() && startIndex < endIndex) {
            String substring = input.substring(startIndex, endIndex);
            System.out.println("Extracted substring: " + substring);
        } else {
            System.out.println("Invalid indices for substring.");
        }

        scanner.close();
    }
}
