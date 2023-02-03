package JavaTaska.ZadanieE1;

import java.util.Scanner;

public class ZadanieDodatkoweE1 {
    /*
    Napisz program, który działa w pętli od 3 do 60. Wyświetl tylko te liczby, które są podzielne przez 3 w JEDNEJ linii.
     */
    public static void main(String[] args) {
        System.out.println("opcja 1"); // zrobiłam sama
        int n = 3;

        for (int i = 3; i <= 60; i++) {
            if (i%n == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nopcja 2");
        for (int i = 30; i <= 60; i+=3) {
            System.out.print(i + ", ");

        }
    }
}
