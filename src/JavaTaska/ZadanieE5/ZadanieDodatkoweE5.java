package JavaTaska.ZadanieE5;

import java.util.Scanner;

public class ZadanieDodatkoweE5 {

    //Napisz program, który pobiera od użytkownika kolejne słowa do momentu podania tekstu koniec, a następnie wyświetla wszystkie podane słowa.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String word = scanner.nextLine();
        String end = "End";
        String string = "";

        while (! word.equals(end)){
            string = string +" " + word;
            System.out.println("Give me a word: ");
            word = scanner.nextLine();
        }
        System.out.println(string);
    }

}