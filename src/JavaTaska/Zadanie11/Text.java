package JavaTaska.Zadanie11;

import java.util.Scanner;

public class Text {
    /*
    Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo,
    aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów (nie biorąc pod uwagę tekstu „Starczy”).
    Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String word = scanner.nextLine();
        String end = "starczy";
        String smallEnd = end.toLowerCase();


       while (! word.equals(smallEnd)){
            int n = word.length();
            System.out.println(n);
            System.out.println("Podaj tekst: ");
            String word2 = scanner.nextLine();
            int n2 = word2.length();
            if (n2>n){
            word=word2;
            n=n2;
            }
        }
        System.out.println(word);

    }
}
