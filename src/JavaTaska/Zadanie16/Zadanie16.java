package JavaTaska.Zadanie16;

import java.util.Scanner;

public class Zadanie16 {
    /*
    Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int)
    i wypisze długość najdłuższego takiego podciągu tych liczb, który jest rosnący.
    Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7” program powinien wypisać
    „5” jako długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] tab = new int[10];
        int longest = 1;
        int current = 1;
        for (int i = 0; i < tab.length; i++) {
            System.out.println("podaj liczbę: ");
            tab[i] = input.nextInt();
        }
        for (int j = 0; j < tab.length; j++) {
            if (tab [j-1]<tab[j]){
                    current++;
            } else{
                if (current>longest){
                    longest=current;
                }
                current=1;
            }
        }
        System.out.println("Najdłuższy ciąg rosnący: " + longest);
    }
}
