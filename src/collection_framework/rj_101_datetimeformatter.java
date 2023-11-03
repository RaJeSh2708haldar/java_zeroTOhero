package collection_framework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class rj_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);


        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy---E H:m a");
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate=dt.format(df);
        System.out.println(mydate);
    }
}
