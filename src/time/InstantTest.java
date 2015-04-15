package time;

import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoField;

import static java.lang.System.out;

/**
 * Created by alext on 4/14/15.
 */
public class InstantTest {

    @Test
    public void test(){

        //One second after the start of era in computer machine time 1970-01-01T00:00:00Z
        final Instant instant = Instant.ofEpochSecond(1);
        out.println(instant);
        //Now in machine time
        final Instant nowInMachineTime = Instant.now();
        out.println(nowInMachineTime);
        //will not work
        //out.println(nowInMachineTime.get(ChronoField.DAY_OF_MONTH));



    }

}
