package JavaTaska.ZadanieA;

import java.util.Scanner;

public class CurrencyExchange {
    /*
    Napisz program, który pobiera od użytkownika informacje o ilości PLN (typ double) oraz walutę (String): EUR,USD,GBP,CZK.
    Następnie program zwraca ilość waluty w obcym nominale.
    DLa ułatwienia:
    1 EUR = 4.69 PLN
    1 USD = 4.43 PLN
    1 GBP = 5.38 PLN
    1 CZK = 0.19 PLN
    Jeżeli podamy walutę, której nie obsługujemy - użytkownik otrzyma stosowany komunikat.
    Zabezpieczyć program przed podaniem waluty w sposób: eur, UsD, CZk, eUR itp.. (.toUpperCase()??)
    */
    public static void main(String[] args) {
        Scanner inputPLN= new Scanner(System.in);
        System.out.println("Enter PLN");
        double Pln = inputPLN.nextDouble();

        Scanner inputCurrency= new Scanner(System.in);
        System.out.println("Select and enter currency: EUR/USD/GBP/CZK");
        String currency = inputCurrency.nextLine();
        String currencyToUpperCase = currency.toUpperCase();
       // System.out.println(currencyToUpperCase);
        String EUR= "EUR";
        String USD = "USD";
        String GBP = "GBP";
        String CZK = "CZK";

        double eur1 = 4.69;
        double usd1 = 4.43;
        double gbp1 = 5.38;
        double czk1 = 0.19;

        boolean correctEur = currencyToUpperCase.equals(EUR);
        boolean correctUsd = currencyToUpperCase.equals(USD);
        boolean correctGbp = currencyToUpperCase.equals(GBP);
        boolean correctCzk = currencyToUpperCase.equals(CZK);


        if (correctEur== true){
           double valueInEur  = Pln/eur1;
            System.out.println("It's " + valueInEur + " EUR");

        } else if (correctUsd== true) {
            double valueInUsd  = Pln/usd1;
            System.out.println("It's " + valueInUsd + " USD");

        }else if (correctGbp== true) {
            double valueInGbp  = Pln/gbp1;
            System.out.println("It's " + valueInGbp + " GBP");

        }else if (correctCzk== true) {
            double valueInCzk  = Pln/czk1;
            System.out.println("It's " + valueInCzk + " CZK");
        }else {
            System.out.println("Currency not recognized");
        }

    }

}
