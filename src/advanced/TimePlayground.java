package advanced;

import java.time.LocalTime;

public class TimePlayground {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        int hour = now.getHour();
        System.out.println("hour = " + hour);

        LocalTime nowWithZeroSeconds = now.withSecond(0).withNano(0);
        /* LocalTime nowWithZeroSecondsAndZeroNano = now.withSeconds.withNano(0);
          */
        System.out.println("nowWithZeroSeconds = " + nowWithZeroSeconds);

        LocalTime nowPlus8Hour = now.plusHours(8);
        System.out.println("nowPlus8Hour = " + nowPlus8Hour);

        LocalTime noon = LocalTime.of(12,0);
        String noonString = noon.toString();
        System.out.println("noonString = " + noonString);

        LocalTime lunchTime = LocalTime.parse("12:59:01");
        System.out.println("lunchTime = " + lunchTime);
    }
}
