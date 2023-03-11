public class CtoFTableDisplay {

    public static double CtoF(double Celsius) {
        return (Celsius * 9) / 5 + 32; // just calculates the Fahrenheit conversion and returns it
    }

    public static void main(String[] args) {

        // using pretty header here
        SafeInput.prettyHeader("Celsius to Fahrenheit");

        // print "Celsius" and "Fahrenheit titles:
        // 11 white space on either side of "Celsius"
        // 9 white space on left side of "Fahrenheit and 10 white space on right side
        System.out.printf("***%11s%s%11s**%9s%s%10s***\n", "", "Celsius", "", "", "Fahrenheit", "");

        // print out 66 asterisks for the separator
        for (int i = 0; i < 66; i++) {
            System.out.print("*");
        }

        System.out.println(); // skip a line

        // print out conversions in increments of 1 from -100 to 100 degrees Celsius
        for (double i = -100; i < 101; i++) {

            // initialize both degree values as strings so we can check the length of them to center them in the table
            String celsius = Double.toString(i);
            String fahrenheit = Double.toString(CtoF(i)); // argument in toString is the current iterator passed into the CtoF method

            // 29 is the amount of space available in each column. divide that by 2 to get the white space on each side
            int celsiusLeft = (29 - celsius.length()) / 2; // amount of white space on left of Celsius value
            int fahrenLeft = (29 - fahrenheit.length()) / 2; // white space on left of Fahrenheit value
            int celsiusRight = celsiusLeft;  // amount of white space on right of Celsius value
            int fahrenRight = fahrenLeft; // amount of white space on right of Fahrenheit

            // if the total amount of white space on both sides of Celsius is odd, add one more needs to be added to the right side
            if ((29 - celsius.length()) % 2 != 0) {
                celsiusRight++;
            }

            // run same check for Fahrenheit
            if ((29 - fahrenheit.length()) % 2 != 0) {
                fahrenRight++;
            }

            // printf statement for Celsius (I separated them for better code readability)
            System.out.printf("***%" + celsiusLeft + "s%" + celsius.length() + "s%" + celsiusRight + "s", "", celsius, "");

            // printf statement for Fahrenheit
            System.out.printf("**%" + fahrenLeft + "s%" + fahrenheit.length() + "s%" + fahrenRight + "s***\n", "", fahrenheit, "");
        }

        // after looping is over, print out 66 asterisks for bottom line
        for (int i = 0; i < 66; i++) {
            System.out.print("*");
        }

    }
}
