package time;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalTime;

import static java.lang.System.out;

/**
 * Created by alext on 4/14/15.
 */
public class DurationTest {

    @Test
    public void test(){

        //Any two Temporals fly
        final Duration betweenTimes = Duration.between(LocalTime.now(),LocalTime.now());
        out.println(betweenTimes);

    }


}
