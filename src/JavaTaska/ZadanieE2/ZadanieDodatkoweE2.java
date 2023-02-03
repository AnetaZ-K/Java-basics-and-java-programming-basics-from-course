package JavaTaska.ZadanieE2;

import java.util.Scanner;

public class ZadanieDodatkoweE2 {
    /*
    Napisz program, który wyświetli silnię z N
    Przykładowe rozwiązanie: 5! = 120
     */
    public static void main(String[] args) {
        Scanner numberN= new Scanner(System.in);
        System.out.println("Give me a n: ");
        int n = numberN.nextInt();

        int i;
        int factorial=1;
        for(i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Silnia liczby "+n+" to: "+factorial);
    }
}


