package JavaTaska.Projekt1;

/*
Projekt 01
1. Napisać proste menu, które będzie miało do wyboru opcje:
    a. add - dodawanie produktu
    b. delete - usuwanie produktu
    c. show - wyświetlenie wszystkich dostępnych produktów
    d. top - wyświetlenie produktu o najwyższej ocenie
    e. exit - wyjście z aplikacji
W tym zadaniu skup się tylko na odpowiedniej obsłudze opcji od użytkownika, wymuszenie tylko małych liter, obsłudze błędu (brak opcji na liście), działanei w pętli.
2. Napisz klasę Product, która posiada pola:
    name (String)
    category (String)
    countOfGrades (int)
    sumOfGrades (double)
    avgGrade (double)
    isAvailable (boolean)
    oraz metody:
    - gettery i settery (pomijamy avgGrade)
    - calculateAverageGrade - oblicza średnią ocenę produktu na podstawie countOfGrades oraz sumOfGrades
    oraz konstruktor, który przyjmuje od użytkownika wszystkie parametry, poza:
    isAvailable - domyślnie ma być ustawione na true
    avgGrade - na start ustawione na 0
3. Stwórz tablicę 10 elementową obiektów klasy Product. Na początku ma być pusta
4. Napisz funkcje, która pozwoli:
    a) Utworzyć nowy produkt (użytkownik podaje wszystkie parametry), a następnie dodaje je do listy. Zanim zaczniemy wprowadzać dane upewniamy się, że mamy puste miejsce w tablicy.
    b) Pozwoli usunąć obiekt z tabeli na podstawie indeksu. Zabezpieczyć w przypadku podania indeksu spoza zakresu.
    c) Wyświetli wszystki obiekty z tabeli
    d) Znajdzie najlepiej oceniany produkt i zwróci go
5. Dodaj powyższe funkcje do menu.
6. Program na powitaniu wyświetli datę i godzinę uruchomienia programu.
 */

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    static void setAvgGradeAll(Product[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != null) {
                tab[i].calculateAvgGrade();
            }
        }
    }

    static void showTopProduct(Product[] tab) {
        setAvgGradeAll(tab);
        double topProduct = 0.0;
        int topIdx = -1;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != null && tab[i].getAvgGrade() > topProduct) {
                topIdx = i;
                topProduct = tab[i].getAvgGrade();
            }
        }

        if (topIdx == -1) {
            System.out.println("Nie znaleziono produktu.");
        } else {
            System.out.println("Top produkt to: " + tab[topIdx].getName());
        }


    }

    static void deleteProduct(Product[] tab) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj idx usuwanego produktu: ");
        int idx = userInput.nextInt();

        if (idx >= 0 && idx < tab.length) {
            tab[idx] = null;
        } else {
            System.out.println("Podano błędny indeks");
        }
    }
    static void addProduct(Product[] tab) {
        int position = -1;
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == null) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Brak miejsca w tabeli");
        } else {
            System.out.print("Podaj nazwę produktu: ");
            String name = userInput.nextLine();
            System.out.print("Podaj nazwę kategorii: ");
            String category = userInput.nextLine();
            System.out.print("Podaj ilość ocen: ");
            int totalGrades = userInput.nextInt();
            System.out.print("Podaj sumę ocen: ");
            double sumOfGrades = userInput.nextDouble();
            tab[position] = new Product(name, category, totalGrades, sumOfGrades);
        }
    }
    static void showProducts(Product[] tab) {
//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i].isAvailable() && tab[i] != null) {
//                System.out.println("Nazwa: " + tab[i].getName() + " Kategoria: " + tab[i].getCategory());
//            }
//        }
        for (Product p : tab) {
            if (p != null && p.isAvailable()) {
                System.out.println("Nazwa: " + p.getName() + " Kategoria: " + p.getCategory());
            }
        }
        System.out.println();
    }

    static void setUnavailable(Product[] tab) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj idx wycofywanego produktu: ");
        int idx = userInput.nextInt();

        if ((idx >= 0 && idx < tab.length) && tab[idx] != null) {
            tab[idx].setAvailable(false);
        } else {
            System.out.println("Podano błędny indeks lub produkt nie istnieje");
        }
    }

    public static void main(String[] args) {
        Product[] tableOfProducts = new Product[5];

        Scanner userInput = new Scanner(System.in);
        String option = "";

        System.out.println("--- " + LocalDateTime.now() + " ---");
        while (!option.equals("exit")) {
            System.out.print("Podaj opcje: ");
            option = userInput.nextLine().toLowerCase();

            switch (option) {
                case "add":
                    addProduct(tableOfProducts);
                    break;
                case "delete":
                    deleteProduct(tableOfProducts);
                    break;
                case "show":
                    showProducts(tableOfProducts);
                    break;
                case "top":
                    showTopProduct(tableOfProducts);
                    break;
                case "disable":
                    setUnavailable(tableOfProducts);
                    break;
                case "exit":
                    System.out.println("Dziękuje za skorzystanie z programu");
                    break;
                default:
                    System.out.println("Nie rozpoznano opcji");
            }
        }

    }
}





