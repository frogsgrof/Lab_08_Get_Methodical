import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayLimit = -1; // stores max number of days in user's birth month. assigned in switch conditional

        // greeting
        System.out.println("Enter your date of birth.");

        // get birth year and month using method
        int year = SafeInput.getRangedInt(in, "Year", 1950, 2010);
        int month = SafeInput.getRangedInt(in, "Month", 1, 12);

        // check if february on leap year
        if (month == 2 && year % 4 == 0) {
            dayLimit = 29;
        } else {
            // if not a february on a leap year, use switch conditional to assign dayLimit
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    // jan, march, may, july, august, oct, and dec all have 31 days
                    dayLimit = 31;
                    break;
                case 2:
                    // this is where non-leap year february is assigned to 28 days
                    dayLimit = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    // april, june, sept, & nov all have 30 days
                    dayLimit = 30;
                    break;
            }
        }

        // using dayLimit variable as "high" parameter, get user's date of birth
        int day = SafeInput.getRangedInt(in, "Day", 1, dayLimit);

        // proceed to birth time like normal
        // sorry, I also changed the hours to match actual 24-hour time because it was bugging me.
        int hour = SafeInput.getRangedInt(in, "Hour", 0, 23);
        int minute = SafeInput.getRangedInt(in, "Minute", 1, 59);

        // print results
        System.out.printf("\nYou were born on %02d/%02d/%d at %d:%02d.", month, day, year, hour, minute);
    }
}
