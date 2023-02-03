package advanced;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePlayground {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        System.out.println("now.format(DateTimeFormatter.BASIC_ISO_DATE) = " + now.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
