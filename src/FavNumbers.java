import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // use methods to assign variables
        int favInt = SafeInput.getInt(in, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        // print results
        System.out.print("Favorite integer: " + favInt + "\n" +
                "Favorite double: " + favDouble);
    }
}
