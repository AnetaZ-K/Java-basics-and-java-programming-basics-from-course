package JavaTaska.Zadanie2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner bodyWeight = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms ");
        float Weight = bodyWeight.nextFloat();

        Scanner heightPerson = new Scanner(System.in);
        System.out.println("Enter your height in centimeters ");

        int heigh = heightPerson.nextInt();
        final float convertToMeters = 0.01F;
        float heighInMeters = heigh*convertToMeters;

        float BMI = (Weight/(heighInMeters*heighInMeters));
        System.out.println("BMI = " + BMI);

        if (BMI>=18.5 && BMI<= 24.9){
            System.out.println("BMI is optimal");
        }else {
            System.out.println("BMI is not optimal");
        }

    }
}
