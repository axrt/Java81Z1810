package time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by alext on 4/14/15.
 */
public class LocalDateTimeTest {

    @Test
    public void test(){

        LocalTime localTime = LocalTime.now();
        LocalDate systemDate=LocalDate.now();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        System.out.println(localDateTime);
        localDateTime = LocalDateTime.of(systemDate,localTime);
        System.out.println(localDateTime);

        localTime = localDateTime.toLocalTime();
        systemDate = localDateTime.toLocalDate();



    }

}
