package JavaTaska.Zadanie10;

import java.util.Scanner;

public class SumOfDig {
    /*
    Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i obliczy sumę cyfr podanej liczby. Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze,
    możesz obliczać resztę z dzielenia liczby przez 10 (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).
     */
    public static void main(String[] args) {
        Scanner numberN= new Scanner(System.in);
        System.out.println("Give me a n: ");
        int n = numberN.nextInt();
        int result = 0;
       // int a = n % 10;
        //int b = n / 10;
        while (n!=0) {
            result+=n%10;
            n/=10;
        }
       // n = b;
        System.out.println("result = " + result);
    }
}
