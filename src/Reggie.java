import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // store each string input in a variable
        String ssn = SafeInput.getRegExString(in, "Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
        String mNum = SafeInput.getRegExString(in, "Enter your M#", "(M|m)\\d{5}");
        String menuChoice = SafeInput.getRegExString(in, "- Menu -\nOpen (O)\nSave (S)\nView (V)\nQuit (Q)\nEnter choice", "[OoSsVvQq]");

        // print them all at the end
        System.out.print("\nSSN: " + ssn + "\n" +
                "M#: " + mNum + "\n" +
                "Menu choice: " + menuChoice + "\n");
    }
}
