package exercises;

import java.util.Scanner;
// base on provided input calculate multiplications from 1 to 10

public class MultiplicationCalculator {
    public static void main(String[] args) {
        // get input from console
        Scanner inputScanner = new Scanner(System.in);
        int x = inputScanner.nextInt();
        System.out.println("x = " + x);
        // calculate multiplications
        /*int result = x*1;
        System.out.println(result);
        result = x*2;
        System.out.println(result);
        result = x*3;
        System.out.println(result);
        result = x*4;
        System.out.println(result);
        result = x*5;
        System.out.println(result);
        result = x*6;
        System.out.println(result);
        result = x*7;
        System.out.println(result);
        result = x*8;
        System.out.println(result);
        result = x*9;
        System.out.println(result);
        result = x*10;
        System.out.println(result);

         */
        // base on provided input calculate multiplications from 1 to 100
        for (int i = 0; i < 100; i++) {
            System.out.println(x*(i+1));

        }


    }

}
