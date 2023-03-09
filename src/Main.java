import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // test int range
        Scanner in = new Scanner(System.in);
        String a = "test";
        int b = SafeInput.getRangedInt(in,a, 4, 9);
        System.out.println("success:" + b);

    }
}