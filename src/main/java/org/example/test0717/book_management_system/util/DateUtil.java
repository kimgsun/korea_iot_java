package org.example.test0717.book_management_system.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final String Pattern = "yyyy-MM-dd HH:mm:ss";

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(Pattern);

    public static String now() {
        return LocalDateTime.now().format(FORMATTER);
    }

    public static String format(LocalDateTime dateTime) { return dateTime.format(FORMATTER);}

    public static LocalDateTime parse(String dateTimeStr) { return LocalDateTime.parse(dateTimeStr, FORMATTER);}
}
