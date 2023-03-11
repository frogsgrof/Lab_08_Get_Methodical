import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(SafeInput.getRegExString(in, "prompt", "\\d{3}-\\d{2}-\\d{4}"));
    }
}