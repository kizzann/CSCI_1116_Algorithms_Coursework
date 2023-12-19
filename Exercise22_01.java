import java.util.*;

public class Exercise22_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        String result = findMaxConsecutiveSubstring(userInput);
        System.out.println("Maximum Consecutive Substring: " + result);
    }

    public static String findMaxConsecutiveSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String currentSubstring = String.valueOf(s.charAt(0));
        String maxSubstring = String.valueOf(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= s.charAt(i - 1)) {
                currentSubstring += s.charAt(i);
            } else {
                currentSubstring = String.valueOf(s.charAt(i));
            }

            if (currentSubstring.length() > maxSubstring.length()) {
                maxSubstring = currentSubstring;
            }
        }

        return maxSubstring;
    }
}