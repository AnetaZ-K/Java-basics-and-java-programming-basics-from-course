package JavaTaska.Zadanie101;

import java.util.Scanner;

public class Zadanie101 {

    /*
    Napisz program, który wyświetli wszystkie dzielniki liczby podanej przez użytkownika.
    Interesują nas tylko dzielenia bez reszty.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                System.out.println(i + " ");

            }

        }


    }
}
