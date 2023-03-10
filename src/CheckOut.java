import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double itemPrice;
        boolean moreItems = false; // loop ender
        double total = 0;

        // loop over every singular item price
        do {
            // set itemPrice to 0 just in case
            itemPrice = 0;

            // get price of 1 item, store in itemPrice
            itemPrice = SafeInput.getRangedDouble(in, "Enter price", .5, 9.99);

            // add current itemPrice to running total
            total += itemPrice;

            // ask user if any more items; store in moreItems
            moreItems = SafeInput.getYNConfirm(in, "Any more items?");

        } while (moreItems);

        // when there are no more items:
        System.out.printf("Your total is: $%,.2f", total);
    }
}
