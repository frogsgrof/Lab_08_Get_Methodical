import java.util.Scanner;

public class SafeInput {

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {

        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }


    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return any integer
     */
    public static int getInt(Scanner pipe, String prompt) {

        int retInt = 0;  // stores valid int
        boolean validInput = false; // loop ender; is set to true when input is an integer
        String trash; // stores bad input

        // loop
        do {
            // prompt user
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt(); // store good input
                pipe.nextLine(); // clear pipe
                validInput = true; // end loop
            } else {
                trash = pipe.nextLine(); // store trash
                System.out.println("ERROR: '" + trash + "' is not an integer."); // print error
            }

        } while (!validInput);

        return retInt;
    }


    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return any double
     */
    public static double getDouble(Scanner pipe, String prompt) {

        double retDouble = 0.0; // stores input
        boolean validInput = false; // loop ender; is set to true when input is an integer
        String trash; // stores bad input

        // loop
        do {
            // prompt user
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble(); // store good input
                pipe.nextLine(); // clear pipe
                validInput = true; // end loop
            } else {
                trash = pipe.nextLine(); // store trash
                System.out.println("ERROR: '" + trash + "' is not a double."); // print error
            }

        } while (!validInput);

        return retDouble;
    }


    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user -- method automatically appends the range onto the end of the prompt, so don't include it in the string.
     * @param low min value for input (inclusive)
     * @param high max value for input (inclusive)
     * @return integer within specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){

        int tempInt; // stores "temporary input" (integer to be tested for range)
        int retInt = 0; // stores final valid input (integer that is within range)
        boolean validInput = false; // loop ender; is set to true when input is an integer
        String trash; // stores bad input

        // loop
        do {
            // prompt user
            System.out.print("\n" + prompt + " (" + low + " - " + high + "): ");

            // initial check for integer
            if (pipe.hasNextInt()) {
                tempInt = pipe.nextInt(); // store int
                pipe.nextLine(); // clear pipe

                if (tempInt >= low) {
                    if (tempInt <= high) { // if fits both criteria

                        retInt = tempInt; // store temporary value in return variable
                        validInput = true; // end loop


                    } else { // if below min, print error
                        System.out.println("ERROR: " + tempInt + " is above the accepted range.");
                    }

                } else { // if above max, print error
                    System.out.println("ERROR: " + tempInt + " is below the accepted range.");
                }

            } else { // if fails integer test
                trash = pipe.nextLine(); // store trash
                System.out.println("ERROR: '" + trash + "' is not an integer."); // print error
            }

        } while (!validInput);

        return retInt;
    }


    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user -- method automatically appends the range onto the end of the prompt, so don't include it in the string.
     * @param low min value for input (inclusive)
     * @param high max value for input (inclusive)
     * @return double within specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {

        double tempDouble; // stores "temporary input" (integer to be tested for range)
        double retDouble = 0.0; // stores final valid input (integer that is within range)
        boolean validInput = false; // loop ender; is set to true when input is an integer
        String trash; // stores bad input

        // loop
        do {
            // prompt user
            System.out.print("\n" + prompt + " (" + low + " - " + high + "): ");

            // initial check for double
            if (pipe.hasNextDouble()) {
                tempDouble = pipe.nextDouble(); // store double
                pipe.nextLine(); // clear pipe

                if (tempDouble >= low) {
                    if (tempDouble <= high) { // if fits both criteria

                        retDouble = tempDouble; // store temporary value in return variable
                        validInput = true; // end loop


                    } else { // if below min, print error
                        System.out.println("ERROR: " + tempDouble + " is above the accepted range.");
                    }

                } else { // if above max, print error
                    System.out.println("ERROR: " + tempDouble + " is below the accepted range.");
                }

            } else { // if fails double test
                trash = pipe.nextLine(); // store trash
                System.out.println("ERROR: '" + trash + "' is not a double."); // print error
            }

        } while (!validInput);

        return retDouble;
    }


    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return boolean; true if user says yes, false if user says no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        String inputString; // stores input
        boolean retBool = false; // stores yes/no answer as boolean to be returned
        boolean validInput = false; // loop ender

        do {
            System.out.print("\n" + prompt + "\n"); // prompt user
            inputString = pipe.next(); // store input
            pipe.nextLine(); // clear pipe

            // if it is one character:
            if (inputString.length() == 1) {

                // proceed to check what the answer is.
                if (inputString.equalsIgnoreCase("Y")) { // if answer is yes
                    retBool = true; // return variable set to true
                    validInput = true; // end loop

                } else if (inputString.equalsIgnoreCase("N")) { // if answer is no
                    // return variable is already set to false
                    validInput = true; // end loop

                } else { // if not yes and not no
                    System.out.println("ERROR: '" + inputString + "' could not be understood. (Enter Y or N.)"); // print error
                }

            } else { // if fails char test
                System.out.println("ERROR: '" + inputString + "' is too long."); // print error
            }

        } while (!validInput);

        return retBool;
    }


    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx RegEx pattern (in String format) that the input should match
     * @return input String that matches the RegEx pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        boolean validInput = false; // loop ender
        String tempString; // stores input not yet tested
        String retString = ""; // stores final input
        String trash; // stores bad input

        do {
            // print prompt
            System.out.print("\n" + prompt + ": ");

            // store input
            tempString = pipe.nextLine();
            pipe.nextLine(); // clear pipe

            // if matches, store in return variable & end loop
            if (tempString.matches(regEx)) {
                tempString = retString;
                validInput = true;

            } else { // if it doesn't match:
                trash = pipe.nextLine(); // store trash
                System.out.println("ERROR: '" + trash + "' is not in the correct format."); // print error
            }

        } while (!validInput);

        return retString;
    }
}
