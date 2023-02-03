package JavaTaska.Zadanie3;

import java.util.Scanner;

public class QuadraticEquation {
    /*
    Napisz program służący do rozwiązywania równania kwadratowego.
    Program powinien pobrać trzy liczby całkowite (współczynniki równania kwadratowego a, b, c) i wyliczyć pierwiastki x1, x2 równania
    Jeśli delta ∆ wyjdzie ujemna, wypisz „Delta ujemna” i zakończ program.
    Potrzebne wzory:
    ax^2 + bx + c = 0
    delta = b^2 - 4ac
    x1 = ( -b - sqrt(delta) ) / 2a
    x2 = ( -b + sqrt(delta) ) / 2a
    x0 = -b / 2a
     */

    public static void main(String[] args) {

        Scanner variableA= new Scanner(System.in);
        System.out.println("Enter variable a ");
        int a = variableA.nextInt();

        Scanner variableB= new Scanner(System.in);
        System.out.println("Enter variable b ");
        int b = variableB.nextInt();

        Scanner variableC= new Scanner(System.in);
        System.out.println("Enter variable c ");
        int c = variableC.nextInt();

        double x1;
        double x2;
        double x0;
        double i = 4 * a * c;
        double delta = ((b*b)- i);
        System.out.println(delta);
        if (delta<0){
            System.out.println("negative delta");
        } else if (delta==0) {
            x0 = (b*(-1))/(2F*a);
            System.out.println("x0 = " + x0);

        } else {
            x1 = (b*(-1) - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1);
            x2 = (b*(-1) + Math.sqrt(delta))/(2*a);
            System.out.println("x2 = " + x2);
        }
    }
}
