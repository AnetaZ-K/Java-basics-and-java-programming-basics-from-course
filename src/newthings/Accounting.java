package newthings;

public class Accounting {
    public static void main(String[] args) {
        Person bob = new Person("Bob", "PM", 15000);
        System.out.println("bob = " + bob);

        Person ted = new Person("Ted", "Developer", 20000);
        System.out.println("ted = " + ted);
        System.out.println("ted.getName() = " + ted.getName());
    }
}
