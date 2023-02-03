package fundamentals;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration number " + i);

        }
        System.out.println(" ");
        for (int i = 0; i < 10; ++i) {
            System.out.println("Iteration number " + i);

        }
        System.out.println(" ");
        for (int i = 0; i >- 10; i--) {
            System.out.println("Iteration number " + i);

        }
        System.out.println(" ");
        System.out.println("While loop ");
        System.out.println(" ");

        int i = 1;
        while (i<10) {                                    // parametr sprawdzany jest przed uruchomieniem pętli
            System.out.println("Iteration number " + i);
            i++;
        }
        System.out.println(" ");

        int index = 0;                                              // w do while kod zawsze jest wykonany przynajmniej raz
        do {                                                        // dlatego że parametr jest sprawdzany po wykonaniu pętli
            System.out.println("Iteration number " + (index + 1) );
            ++index;
        } while (index<10);

        System.out.println("rest of the code");     // niesończoną pętlę zatrzymujemy recznie czerwonym kwadratem



    }

}
