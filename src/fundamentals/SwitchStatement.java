package fundamentals;

public class SwitchStatement {
    public static void main(String[] args) {
        char input ='n';
        switch(input){
            case 'a':
                System.out.println("it is a vowel");
                break;
            case 'e':
                System.out.println("it is a vowel");
                break;
            case 'i':
                System.out.println("it is a vowel");
                break;
            case 'o':
                System.out.println("it is a vowel");
                break;
            case 'u':
                System.out.println("it is a vowel");
                break;
            case 'y':
                System.out.println("it is a vowel");
                break;
            default:
                System.out.println("it is not a vowel");
                break;

        }
        switch (input){
            case'a','e','i','o','u','y':
                System.out.println("it is a vowel");
            default:
                System.out.println("it is not a vowel");
        }


        String sureName = "Szczęsny";
        switch (sureName){
            case "Szczęsny":
                System.out.println("Polska wins");
                break;
            case "Nieszczęsny":
                System.out.println("Polska loses");
                break;
            default:
                System.out.println("unexpected error");
                break;
        }
    }
}
