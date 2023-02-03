package advanced;

public class MethodsTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            print();
        }
        print();
        printName("john");
        String first = "John";
        String name = "Kowalski";
       String fullName = getFullName ( first, name);
        System.out.println(fullName);

        printOnlyIfEven (3);
    }
    static void print () {
        System.out.println("hello world");
    }  //default access modifier - package private access
    // (domyślny modyfikator dostępu daje dostęp do metody jedynie dla klas znajdujących się w pakiecie

    static private void printName (String name) {
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
    }
    static private String getFullName(String firstName, String surName){
        String fullName = firstName + " " +surName;
        return fullName;
    }
    static private void  printOnlyIfEven ( int number){
        if (number % 2 == 0 )
            return;
            System.out.println(number);
        }
    }




