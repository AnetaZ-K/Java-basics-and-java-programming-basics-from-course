package JavaTaska.Zadanie14;

import java.util.Scanner;

public class Zadanie14 {
    /*
    Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char) i wyliczy,
    ile znaków stoi w alfabecie pomiędzy podanymi literami.
    Podpowiedź – skorzystaj z tablicy kodów ASCII i traktuj znaki jak liczby int.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę alfabetu: ");
        int a = (int) scanner.next().toLowerCase().charAt(0);
        int b = (int) scanner.next().toLowerCase().charAt(0);

        if (a==b){
            System.out.println("Podano takie same litery");
        } else
        System.out.println("pomiędzy literami jest " + (Math.abs(b-a)-1) + "litera"); // Math.abs tworzy wartośc bezwzględną

    }
}
