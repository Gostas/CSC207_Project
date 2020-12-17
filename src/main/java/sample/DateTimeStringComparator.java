package main.java.sample;

import java.time.LocalDateTime;
import java.util.Comparator;

/**
 * Custom comparator to compare the DateTime field of every event in the schedule
 */
public class DateTimeStringComparator implements Comparator<LocalDateTime> {
    @Override
    public final int compare(final LocalDateTime t1, final LocalDateTime t2){
        if(t1.isBefore(t2)) return -1;
        else if(t1.isEqual(t2)) return 0;
        return 1;
    }
}
