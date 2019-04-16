package net.shop.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String DEFAULT_SHORT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String DEFAULT_SHORT_DATE_FORMAT_ZH = "yyyy年M月d日";
    public static final String DEFAULT_LONG_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm";
    public static final String DEFAULT_TIMESTAMP = "yyyyMMddHHmmss";


    public static String getCurrTimeStr(){
        return getCurrDateStr(TIME_FORMAT);
    }

    public static String getCurrDateStr() {
        return getCurrDateStr(DATETIME_FORMAT);
    }

    public static String getCurrDateStr(String dateFormat) {
        return convertDateToStr(new Date(), dateFormat);
    }


    public static String convertDateToStr(Date date, String dateFormat) {
        if (date == null) {
            return "";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            return sdf.format(date);
        }
    }

}
