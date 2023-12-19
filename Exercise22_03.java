import java.util.*;

public class Exercise22_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String firstString = input.nextLine();

        System.out.println("Enter another string: ");
        String secondString = input.nextLine();

        boolean result = findPatternMatching(firstString, secondString);

        if (result)
            System.out.println("The second string is a substring of the first string.");
        else
            System.out.println("The second string is NOT a substring of the first string");
    }

    public static boolean findPatternMatching(String a, String b) {
        int firstLength = a.length();
        int secondLength = b.length();

        if (firstLength < secondLength) {
            return false;
        }

            for (int i = 0; i <= firstLength - secondLength; i++) {
                boolean result = true;

                for (int j = 0; j < secondLength; j++) {
                    if (a.charAt(i + j) != b.charAt(j)) {
                        result = false;
                        break;
                    }
                }
                if (result)
                    return true;
            }
        return false;
        }
    }
