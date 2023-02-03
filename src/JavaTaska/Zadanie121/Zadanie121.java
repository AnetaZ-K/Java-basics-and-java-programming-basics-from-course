package JavaTaska.Zadanie121;

public class Zadanie121 {
    /*
    Napisz klasę Student, która posiada pola: firstName (String), lastName (String), avgGrade (double),
    isActive (boolean) oraz metody: gettery, settery. Dodatkowo zastąp domyślny konstruktor
    (czyli zdefiniuj nowy), który wymaga wartości dla pól: firstName, lastName.
    Pole avgGrade ma zostać ustawione na 0.0, a isActive na True.
    */

    public static void main(String[] args) {
        Student s1 = new Student ("Adam", "Kowalski");
        System.out.println(s1.getAvgGrade());
        System.out.println(s1.isActive());
    }
}
