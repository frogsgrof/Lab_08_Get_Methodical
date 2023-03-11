import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reggie {

    /*
    Use your getRegExString method several times.
- get a SSN from the user using this pattern: \\d{3}-\\d{2}-\\d{4}
- get a UC Student M number using this pattern (M|m)\\d{5}
-get a menu choice using this pattern [OoSsVvQq]
these letters are mnemonics for the menu choices Open Save View Quit

Do several test runs with strings that match and fail each pattern.
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String tempString;
        String reggie = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");

        System.out.println("debug: " + reggie);
    }
}
