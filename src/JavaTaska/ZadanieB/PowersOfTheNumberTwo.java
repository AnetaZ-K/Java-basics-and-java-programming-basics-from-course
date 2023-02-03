package JavaTaska.ZadanieB;

import java.util.Scanner;

public class PowersOfTheNumberTwo {
    /*
    Napisz program, który wyświetli na konsoli kolejne potęgi liczby 2: 2^1, 2^2, 2^3, ..., 2^n.
    Wartość n możemy być zmienną lub informacją podaną przez użytkownika.
     */

    public static void main(String[] args) {
        Scanner numberN= new Scanner(System.in);
        System.out.println("Give me a n: ");
        int n = numberN.nextInt();
        double a = 2;

        for (int i = 1; i <= n; i++) {
           double b= Math.pow(a,i);
            System.out.println("i " + i +" = " + b);

        }

    }

}
