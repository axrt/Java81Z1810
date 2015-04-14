package time;
import org.junit.Test;

import java.time.LocalTime;

import static java.lang.System.out;
/**
 * Created by alext on 4/14/15.
 */
public class LocalTimeTest {

    @Test
    public void test(){

        //System time
        final LocalTime localTime = LocalTime.now();
        out.println("System time: " + localTime);
        final int hour = localTime.getHour();
        final int minute=localTime.getMinute();
        final int second=localTime.getSecond();
        out.println("Hour: " + hour);
        out.println("Minute: " + minute);
        out.println("Second: " + second);

    }

}
