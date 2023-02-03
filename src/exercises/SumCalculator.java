package exercises;
// check if sum of two integers is equals to third integers (sprawdz czy istnieje taka kombinacja dwóch intów,że ich suma daje nam trzeci int)

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("please input first integer");
        int a = inputScanner.nextInt();
        System.out.println("please input second integer");
        int b = inputScanner.nextInt();
        System.out.println("please input third integer");
        int c = inputScanner.nextInt();

        System.out.println("input = " + a + " " + b + " " + c);

        if (a + b == c){
            System.out.println("Found match");
        } else if (a + c == b) {
            System.out.println("Found match");
        } else if (b + c == a) {
            System.out.println("Found match");
        } else {
            System.out.println("Match not found");
        }

        boolean firstCombination = (a+b==c);
        boolean secondCombination = (a+c==b);
        boolean thirdCombination = (b+c==a);
        boolean result = firstCombination || secondCombination || thirdCombination;
        System.out.println(result);


    }
}
