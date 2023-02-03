package JavaTaska.Zadanie12;

import java.util.Scanner;

public class zadanie12 {
    /*
    Napisz program, który pobierze od użytkownika tekst (zmienną typu String)
    i policzy jakim procentem wszystkich znaków tekstu był znak spacji.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a text: ");
        String text = scanner.nextLine();
        int sum = 0;
        char a = ' ';
        char b;
        for (int i = 0 ; i < text.length() ; i++){
            b=text.charAt(i);
            if(a==b){
                sum++;
            }
        }
        System.out.println("Ilość spacji = " + sum);
        System.out.println("Ilośc liter = " + text.length());
        float percent = ((float)sum/text.length())*100;
        System.out.println("Ilość spacji w % w całym tekscie = " + percent );

    }

}
