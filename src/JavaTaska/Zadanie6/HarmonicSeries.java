package JavaTaska.Zadanie6;

import java.util.Scanner;

public class HarmonicSeries {

    //Napisz program, który pobierze od użytkownika liczbę n (typu int)
    // i obliczy sumę szeregu harmonicznego od 1 do n, zgodnie ze wzorem poniżej: Hn = 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n

    public static void main(String[] args) {
        Scanner numberN = new Scanner(System.in);
        System.out.println("Give me a n: ");
        int n = numberN.nextInt();

        // i = n | 1 + 1/2 + 1/3 + ... + 1/n

       /* double result = 1.0;

        for (int i = 2; i <= n; i++) {
             result += 1.0/i;
        }
        System.out.println("Wynik: " + result);*/
        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            if (i != 1) {
                result += 1.0/i;
            }
        }
        System.out.println("Wynik: " + result);


    }
}



