package com.learn.collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data.getTime());
        SimpleDateFormat dataFormat = new SimpleDateFormat("yy");
        String datatime = dataFormat.format(data);
        System.out.println(datatime);

        Calendar c = new GregorianCalendar();
        System.out.println(c);
    }
}
