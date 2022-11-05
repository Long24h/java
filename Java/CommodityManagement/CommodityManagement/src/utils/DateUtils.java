package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static String pattern = "dd-mm-yyy HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    public static String formatDateToString(Date dateUtils){
        return simpleDateFormat.format(dateUtils);
    }
}
