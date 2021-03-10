package com.demo.Utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * dateUtils
 * @date 2020-08-18
 * @author 李梓阳
 */
public class DateUtils {

    private static final int WEEK_LENGTH = 7;

    /**
     * find out all suit weekdays between startTime and endTime, accounting to the programmer scanned.
     * @param startTime the time range beginning
     * @param endTime the time range stop
     * @param weekday about which weekday is chosen
     * @return
     */
    public static List<Date> getWeekdays(Date startTime, Date endTime, WeekdaysEnum weekday) {
        if (!startTime.before(endTime)) { return null; }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        Date dateObj = null;
        for (int i = 0; i < WEEK_LENGTH; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) - 1 == weekday.getDay()) {
                dateObj = calendar.getTime();
                break;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        if (dateObj == null || dateObj.after(endTime)) { return null; }
        List<Date> result = new ArrayList<>();
        calendar.setTime(dateObj);
        while(!dateObj.after(endTime)) {
            result.add(dateObj);
            calendar.add(Calendar.DAY_OF_MONTH, 7);
            dateObj = calendar.getTime();
        }
        return result;
    }
}
