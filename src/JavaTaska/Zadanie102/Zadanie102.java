package JavaTaska.Zadanie102;

import java.util.Scanner;

public class Zadanie102 {
    /*
    Napisz program, który wyświetli "lustrzane odbicie" podanej cyfry. Np. 123 -> 321 lub 1056 -> 6501.
     */
    public static void main(String[] args) {
        Scanner numberN= new Scanner(System.in);
        System.out.println("Give me a number ");
        int n = numberN.nextInt();
        String result = "";
        // int a = n % 10;
        //int b = n / 10;
        while (n!=0) {
            result+=n%10;
            n/=10;
        }
        System.out.println("result = " + result);
    }
}
