package collection_framework;

import java.util.Calendar;
import java.util.TimeZone;

public class rj_98_calender {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        //Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        //System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
    }
}
