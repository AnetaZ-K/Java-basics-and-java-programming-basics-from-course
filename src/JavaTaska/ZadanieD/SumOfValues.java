package JavaTaska.ZadanieD;

import java.util.Scanner;

public class SumOfValues {
    public static void main(String[] args) {

        /* Program pobiera od użytkownika liczby całkowite,
        dopóki nie poda 0.
        Następnie zwraca sumę podanych wartości.
         */

        Scanner numberN = new Scanner(System.in);
        System.out.println("Give me a n: ");
        int n = numberN.nextInt();
        int result = 0;


        /*while (dopóki użytkownik nie poda 0) {
            1. Pobranie wartości od użytkownika
            2. Dodanie tej wartości do sumy
        }
        Wyświetlenie wyniku*/

        while (n!=0) {
            result += n ;
            //System.out.println(result);
            System.out.println("Give me a next n: ");
            n = numberN.nextInt();
        }
        System.out.println(result);
    }
}

