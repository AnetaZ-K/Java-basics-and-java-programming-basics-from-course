package JavaTaska.Zadanie4;

import java.util.Scanner;

public class BangBang {
    /*
    Napisz program, który pobierze od użytkownika dodatnią liczbę (typu int) i wypisze wszystkie liczby od 1 do podanej liczby, każda w kolejnej linijce, z następującymi zmianami:
    w miejscu liczb podzielnych przez 3, zamiast liczby program powinien wypisać „Pif”
    w miejscu liczb podzielnych przez 7, zamiast liczby program powinien wypisać „Paf”
    jeśli liczba jest podzielna zarówno przez 3, jak i 7, program powinien wypisać „Pif paf”
     */
    public static void main(String[] args) {
        Scanner numberA= new Scanner(System.in);
        System.out.println("Give me a number ");
        int a = numberA.nextInt();

        for (int i = 1; i <= a; i++) {
            int c = 0;
            if (i%3==c && c==i%7) {
                System.out.println("pif paf");
            } else if (c==i%3) {
                System.out.println("pif");
            }else if (c==i%7) {
                System.out.println("paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
