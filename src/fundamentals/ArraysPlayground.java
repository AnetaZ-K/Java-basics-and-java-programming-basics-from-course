package fundamentals;

public class ArraysPlayground {
    public static void main(String[] args) {

        int[] intArray;
        intArray = new int[5]; // creation of a new array of size 5

        int[] secondIntArray = new int[]{1,2,3,4};

        String[] string = new String[5];

        /*Wyjątek ArrayIndexOutOfBoundsException jest jednym z najczęstszych błędów w Javie.
        Występuje, gdy program próbuje uzyskać dostęp do nieprawidłowego indeksu w tablicy,
        tj. indeksu, który jest mniejszy niż 0, równy lub większy niż długość tablicy
         */
        String[] strings = new String[5];
        strings[0] = "Jim";
        strings[4] = "Michael";
        // strings[5] = "Dweight";  -> ArrayIndexOutOfBoundsException
        strings[1] = "Dweight";

        System.out.println(strings[1]);

        String name = strings[4];
        System.out.println("name = " + name);
        String nameUpperCase = name.toUpperCase();
        System.out.println("nameUpperCase = " + nameUpperCase);

        for (int i = 0; i < strings.length; i++) {     //iterowanie po tablicy ... .length
            System.out.println("hello");
        }

        for (int i = 0; i < strings.length; i++) {
            String item = strings[i];
            System.out.println("item = " + item);
        }
        for (String item : strings) {
            System.out.println(item);
        }
        for (int item : secondIntArray) {
            System.out.println(item);
        }



    }
}
