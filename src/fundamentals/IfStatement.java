package fundamentals;

public class IfStatement {
    public static void main(String[] args) {
        if (true){
            System.out.println("hello from if block");

        }
        System.out.println("End of code execution");

        if (true) {
            System.out.println(" Positive case");
        }else {
            System.out.println(" Negative case");
        }
        System.out.println("End of code execution");

        if (false) {
            System.out.println(" Positive case");
        }else {
            System.out.println(" Negative case");
        }
        System.out.println("End of code execution");
        System.out.println(" ");

        char input= 'o'; // czy char jest samogłoską (a; e; i; o; u; y)
        if ('a' == input) {
            System.out.println("it is a vowel");
        } else if ('e' == input) {
            System.out.println("it is a vowel");
        } else if ('i' == input) {
            System.out.println("it is a vowel");
        } else if ('o' == input) {
            System.out.println("it is a vowel");
        } else if ('u' == input) {
            System.out.println("it is a vowel");
        } else if ('y' == input) {
            System.out.println("it is a vowel");
        }else {
            System.out.println("it is not a vowel");
        }
        System.out.println(" ");


        if (input=='a'|| input=='e'|| input=='i'||input=='o'||input=='u'||input=='y'){
            System.out.println("it is a vowel");
        } else {
            System.out.println("it is not a vowel");
        }
    }
}
