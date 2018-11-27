package CDI.Produces;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by vera on 18-11-27.
 */
public class TimeLogger {
    private SimpleDateFormat dateFormat;
    private Calendar calendar;

    public TimeLogger(SimpleDateFormat dateFormat, Calendar calendar) {
        this.dateFormat = dateFormat;
        this.calendar = calendar;
    }

    public String getTime() {
        return dateFormat.format(calendar.getTime());
    }
}
