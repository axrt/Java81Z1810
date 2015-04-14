package time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

import static java.lang.System.out;

/**
 * Created by alext on 4/14/15.
 */
public class TemporalFieldTest {

    @Test
    public void test(){

        final LocalDate systemDate=LocalDate.now();
        out.println("Month of year: "+systemDate.get(ChronoField.MONTH_OF_YEAR));
        out.println("Day of month: "+systemDate.get(ChronoField.DAY_OF_MONTH));
        out.println("Day of week: "+systemDate.get(ChronoField.DAY_OF_WEEK));

    }
}
