package fundamentals;

public class StringPlayground {
    public static void main(String[] args) {
        String text = "Hello String";
        System.out.println(text);

        String text1 = new String( "Hello String"); // new tworzy string poza pulą stringów
        System.out.println(text1);

        boolean result = text1 == text;
        System.out.println("result text1 == text = " + result);

        result = text.equals(text1);                               // porównywanie stringów lub obiektów metodą equals
        System.out.println("result = text.equals(text1) " + result);


        String  text2 = text1.intern();     // intern dodaje string do puli stringów lub ponownie używa referencj juz istniejącej
        result= text == text2;
        System.out.println("result = " + result);

        String have ="ma";                      //brak przypisania zmienionej wartości do jakiegoś stringa
        have.toUpperCase();
        System.out.println(have);

        String ala = "ala";                    // posiadamy 2 stringi : ala ; alaUpperCase ( na podstawie stringa ala tworzymy nowy string alaUpperCase)
        String alaUpperCase = ala.toUpperCase();
        System.out.println(ala);
        System.out.println(alaUpperCase);

        String kot = "KOT";                 // posidamy tylko 1 string kot i jemu przypisujemy nową watrość (przez to traciny dostęp do starego stringa)
        kot = kot.toLowerCase();
        System.out.println(kot);

        String val = "Polska gola";
        String val1 = "taka jest kibiców wola";

        String res = val + " " + val1;               // konkatenacja (łączenie) za pomoca znaku +
        System.out.println(res);

        String res1 = val.concat(" ").concat(val1);          // konkatenacja za pomocą metody concat
        System.out.println(res1);


        String val3 = "Some text";
        int length = val3.length();
        System.out.println("length = " + length);

        System.out.println("length = " + val3.length());

        System.out.println(val3.toUpperCase());

        int indexOfS  = val3.indexOf('S');             // indeksujemy od 0
        System.out.println("indexOfS = " + indexOfS); // indeks litery S

        int indexOfTe = val3.indexOf("tes");            // indeks ciągu liter "tes"
        System.out.println("indexOfTe = " + indexOfTe);

        System.out.println("val4 = " + val3.replaceAll("e", "a"));  //zamiana wszystkich liter "e" na "a"


    }
}
