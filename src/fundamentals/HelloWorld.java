package fundamentals;

import com.sun.jdi.ShortType;

public class HelloWorld {

        public static void main(String[] args) {
            System.out.println("hello world");

            int name; // variable declaration (deklaracja)
            name = 6; // variable initialization (inicjacja)

            name = 5;
            System.out.println(name);

            final int value = 8; // ostateczna wartosc
            /*value = 11; // zmiana wartosci zmiennej final wywala błąd*/

            System.out.println(value);

           /*
           TYPY ZMIENNYCH

             ZMIENNE CAŁKOWITE

            byte = 127;
            byte = -128

            short= 32000

            int= 214783647

            long = 2^63
            long = -2^63
            long longValue = 324798643235789976L

            ZMIENNE ZMIENNOPRZECINKOWE (zawsze z kropką)

            float floatValue = 0.0001F (6-7 miejsc po przecinku)
            double (15 miejsc po przecinku)

            DLA ZMIENNYCH O DUZYCH WARTOŚĆIACH
            BigInteger
            BigDecimal

            ZMIENNA LOGICZNA
            boolean trueValue = true
            boolean falseValue = false

            ZMIENNA ZNAKOWA
            char charValue ='t'
            char charValueLineEnd = '/n'       (/n powoduje przejście do nowej lini)

            ZMIENNA ŁAŃCUCHOWA/ TEKSTOWA
            String text = "some text"

            */

        }
}