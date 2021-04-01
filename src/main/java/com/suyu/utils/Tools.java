package com.suyu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools
{
    public static String date2Str(final Date date, final String format) {
        if (date != null) {
            final SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }
        return "";
    }
    
    public static String getTimeNow() {
        return date2Str(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
}
