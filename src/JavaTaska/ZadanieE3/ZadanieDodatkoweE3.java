package JavaTaska.ZadanieE3;

import java.util.Scanner;

public class ZadanieDodatkoweE3 {

    //Napisz program, który będzie powtarzał słowa podane przez użytkownika do momentu podania słowa: koniec

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String word = scanner.nextLine();
        String end = "End";

      /* if (word != end){
           System.out.println(word);
           word = scanner.nextLine();
          }*/

        while (! word.equals(end)){
            System.out.println(word);
            System.out.println("Give me a word: ");
            word = scanner.nextLine();
        }
    }
}
