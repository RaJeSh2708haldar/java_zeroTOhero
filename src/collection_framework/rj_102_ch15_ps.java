package collection_framework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class rj_102_ch15_ps {
    public static void main(String[] args) {
        //Question no:1
        ArrayList ar=new ArrayList();
        ar.add("raj");
        ar.add("ram");
        ar.add("gota");
        ar.add("priom");
        ar.add("priya");
        ar.add("raju");
        ar.add("shuvo");
        ar.add("joy");
        ar.add("rana");
        ar.add("rajesh");
        for(Object o:ar){
            System.out.println(o);
        }

        //Question no:2
        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //Question no:3
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //Question no:4
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String mydate=dt.format(df);
        System.out.println(mydate);

        //Question no:5
        HashSet<Integer> s=new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(16);
        s.add(46);
        s.add(9);
        s.add(6);
        System.out.println(s);
    }
}
