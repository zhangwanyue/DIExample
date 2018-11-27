package CDI.Produces;

import javax.enterprise.inject.Produces;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by vera on 18-11-27.
 */
public class TimeLoggerFactory {
    // Whenever we get an ImageFileProcessor instance, CDI will scan the TimeLoggerFactory class
    // then call the getTimeLogger() method (as it’s annotated with the @Produces annotation)
    // and finally inject the Time Logger service.
    @Produces
    public TimeLogger getTimeLogger() {
        return new TimeLogger(new SimpleDateFormat("HH:mm"), Calendar.getInstance());
    }
}
