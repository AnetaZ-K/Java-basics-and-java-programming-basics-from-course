package advanced;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DatePlayground {
    public static void main(String[] args) {
        LocalDate now = LocalDate.ofEpochDay(0);
        System.out.println(now);
        LocalDate dayPlus2 = now.plusDays(2);
        DayOfWeek day = dayPlus2.getDayOfWeek();
        System.out.println("Day = " + day);

        LocalDate christmas = LocalDate.parse("2022-12-24");
        System.out.println("christmas = " + christmas);
        System.out.println("christmas.getDayOfYear() = " + christmas.getDayOfYear());
    }
}
