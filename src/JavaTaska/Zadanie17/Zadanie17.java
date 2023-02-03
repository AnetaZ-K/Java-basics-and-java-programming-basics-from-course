package JavaTaska.Zadanie17;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Zadanie17 {
    /*
    Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy
    ile dni do nich pozostało. Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate.
    Obecną datę pobierz z metody LocalDate.now().
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę zajęć: ");
        String lessonStringDate = scanner.nextLine();
        LocalDate lessonDate = LocalDate.parse(lessonStringDate);
        LocalDate today = LocalDate.now();

        System.out.println("podana data: " + lessonDate + " Dzisiaj: " + today);

        if (lessonDate.isBefore(today)){
            System.out.println("Podałeś datę z przesłości");
        } else {
            System.out.println("Do zajęć pozostało " + (lessonDate.getDayOfYear() - today.getDayOfYear()) + "dni");
        }
    }
}
