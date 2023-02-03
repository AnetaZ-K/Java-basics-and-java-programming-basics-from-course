package advanced;

import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexPlayground {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile ("a"); //"a+" ; "a+a"; "a*"; "a*a" true
        Matcher matcher = pattern.matcher("a");
        boolean result = matcher.matches();

        System.out.println("result = " + result);

        pattern = Pattern.compile ("[a-zA-Z]");
        matcher = pattern.matcher("GG");
        result = matcher.matches();

        System.out.println("result1 = " + result);

        pattern = Pattern.compile ("[A-Z][a-z]+"); // ("[A-Z][a-z]{1,10}")
        matcher = pattern.matcher("Jan");
        result = matcher.matches();

        System.out.println("name matcher = " + result);


    }

}
