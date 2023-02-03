package JavaTaska.Zadanie13;

import java.util.Scanner;

public class Zadanie13 {
    /*
    Napisz program, który „się jąka”, to znaczy pobiera od użytkownika tekst (zmienną typu String),
     a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po dwa razy.
     Przykładowo, dla wejścia:„To jest mój test” program powinien wypisać „To To jest jest mój mój test test”.
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a text: ");
            String text = scanner.nextLine();
            String[] words = text.split(" ");
            for (String word : words){
                System.out.print(word+" "+word + " ");
            }


    }
}
