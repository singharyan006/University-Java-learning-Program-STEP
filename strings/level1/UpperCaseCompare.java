import java.util.Scanner;

public class UpperCaseCompare {

    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String builtInUpper = input.toUpperCase();
        String manualUpper = convertToUpperCase(input);

        boolean isSame = compareStrings(builtInUpper, manualUpper);

        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Manual uppercase:   " + manualUpper);
        System.out.println("Are both conversions equal? " + isSame);
    }
}
