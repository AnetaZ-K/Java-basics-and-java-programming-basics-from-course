package JavaTaska.Zadanie1;

import java.util.Scanner;

public class Circle {
    /*
    Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float) i obliczy obwód tego okręgu.
    Do obliczeń przyjmij najpierw π = 3.14, a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        final float myPI = 3.14F;

        System.out.println("Put circumference of a circle");
        float diameter = inputScanner.nextFloat();

        System.out.println("circumference of a circle with myPI " + (myPI*diameter));
        System.out.println("circumference of a circle with Math.PI " + (Math.PI*diameter));
    }
}
