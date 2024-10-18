package br.ufpa.traffic_api.core.utils;

import java.util.Date;

public abstract class CalendarSystem {

    public static boolean isAfter(Date date) {

        Date now = new Date();
        boolean isAfterDay = now.getDay() > date.getDay();
        boolean isAfterMonth = now.getMonth() > date.getMonth();
        boolean isAfterYear = now.getYear() > date.getYear();

        return isAfterDay && isAfterMonth && isAfterYear;
    }

}
