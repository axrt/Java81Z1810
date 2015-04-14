package time;

import org.junit.Test;
import static java.lang.System.out;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 * Created by alext on 4/14/15.
 */
public class LocalDateTest {
    /**
     * Immutable
     * Plain date (no time of day)
     * Does not carry time zone information
     */
    @Test
    public void test(){

        final LocalDate localDate = LocalDate.of(2015,4,14);
        //Is the year leap year?
        out.println("Year is leap: "+localDate.isLeapYear());
        out.println("Year: "+localDate.getYear());
        //Month is an enum, representing months
        final Month month = localDate.getMonth();
        out.println("Month: "+month);
        //In two months from April, June happens (supports minus as well)
        out.println("In two months: "+month.plus(2));
        //Length of month
        out.println("April has: " + localDate.lengthOfMonth() + " days");
        out.println();

        //Day can be "extracted" for week, month or year
        //getDayOfWeek() returns DayOfWeek object, while the others return an int value
        out.println("Day of week: "+localDate.getDayOfWeek());
        out.println("Day of month: "+localDate.getDayOfMonth());
        out.println("Day of year: "+localDate.getDayOfYear());

    }
}
