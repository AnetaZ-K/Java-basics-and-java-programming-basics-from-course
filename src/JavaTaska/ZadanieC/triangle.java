package JavaTaska.ZadanieC;

import java.util.Scanner;

public class triangle {
    /*
    Napisz program, który wygeneruje trójkąt o wysokości n. Przykładowo:
    dla n = 3 otrzymamy wynik:
    *
    **
    ***
    dla n = 5 otrzymamy wynik:
    *
    **
    ***
    ****
    *****
     */
    public static void main(String[] args) {
        String a = "*";
        Scanner numberN= new Scanner(System.in);
        System.out.println("Give me a n: ");
        int n = numberN.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
