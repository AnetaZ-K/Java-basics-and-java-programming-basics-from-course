package JavaTaska.ZadanieA;

import java.util.Scanner;

public class ZadanieA {

        public static void main(String[] args) {
            final double valueOfEUR = 4.69;
            final double valueOfUSD = 4.43;
            final double valueOfGBP = 5.38;
            final double valueOfCZK = 0.19;

            Scanner userInput = new Scanner(System.in);
            System.out.print("Podaj ilość: ");
            double amount = userInput.nextDouble();
            userInput.nextLine();
            System.out.print("Podaj walutę: ");
            String currency = userInput.nextLine();

            double res;

            switch (currency.toUpperCase()) {
                case "EUR":
                    System.out.println("PLN -> EUR to: " + (amount/valueOfEUR));
                    break;
                case "USD":
                    System.out.printf("PLN -> USD to: %.2f", (amount/valueOfUSD));
                    break;
                case "GBP":
                    System.out.printf("PLN -> GBP to: %.2f", (amount/valueOfGBP));
                    break;
                case "CZK":
                    System.out.printf("PLN -> CZK to: %.2f", (amount/valueOfCZK));
                    break;
                default:
                    System.out.println("Nie rozpoznano waluty.");
                    break;
            }

        }
}

