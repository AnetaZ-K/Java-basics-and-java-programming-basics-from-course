package JavaTaska.ZadanieE4;

import java.util.Scanner;

public class ZadanieDodatkoweE4 {
    /*
    Napisz program, który na początku pobierze opcje od użytkownika. Dostępne opcje: dodaj, odejmij.
    Następnie użytkownik poda dwie wartości zmiennoprzecinkowe na których wykona się operacja matematyczna podana na początku.
    Rozwiń program o opcje pomnóż, podziel. Pamiętaj o zabezpieczeniu programu: dzielenie przez zero oraz podanie opcji np. w sposób DODAJ
     */

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Podaj opcje [dodaj/odejmij/pomnóż/podziel]: ");
        String option = userInput.nextLine();
        System.out.print("Podaj I liczbę: ");
        double x = userInput.nextDouble();
        System.out.print("Podaj II liczbę: ");
        double y = userInput.nextDouble();

        switch (option.toLowerCase()) {
            case "dodaj":
                System.out.println("Wynik: " + (x+y));
                break;
            case "odejmij":
                System.out.println("Wynik: " + (x-y));
                break;
            case "pomnóż":
                System.out.println("Wynik: " + (x*y));
                break;
            case "podziel":
                if (y == 0.0) {
                    System.out.println("Nie wolno dzielić przez zero!");
                } else {
                    System.out.println("Wynik: " + (x / y));
                }
                break;
            default:
                System.out.println("Nie znam tej opcji.");
                break;
        }
    }
}
