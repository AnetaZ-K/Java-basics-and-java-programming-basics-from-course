package JavaTaska.Zadanie19;

public class Zadanie19 {

    /* Napisz program, składający się z kilku klas:
a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality (oba typu String)
b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)
c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
    i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
    ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)
    */

    public static void main(String[] args) {
        Author a1 = new Author();
        a1.setSurname("Mickiewicz");
        a1.setNationality("PL");

        Author a2 = new Author();
        a2.setSurname("Mass");
        a2.setNationality("USA");

        Author a3 = new Author();
        a3.setSurname("Mróz");
        a3.setNationality("PL");

        Poem p1 = new Poem();
        p1.setCreator(a1);
        p1.setStropheNumbers(230);

        Poem p2 = new Poem();
        p2.setCreator(a2);
        p2.setStropheNumbers(120);

        Poem p3 = new Poem();
        p3.setCreator(a3);
        p3.setStropheNumbers(700);

        Poem[] tableOfPoems = new Poem[]{p1,p2,p3};
        int topStropheNumbers = 0;
        String topAuthor = "";

        for (Poem p:tableOfPoems) {
            if (p.getStropheNumbers()>topStropheNumbers){
                topStropheNumbers = p.getStropheNumbers();
                topAuthor = p.getCreator().getSurname(); // p.getCreator() zwraca obiekt klasy Author
            }
        }
        System.out.println("Autor powieści z największą liczbą zwrotek to: " + topAuthor);
    }
}
