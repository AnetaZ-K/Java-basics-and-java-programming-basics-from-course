package fundamentals;

public class IncrementationOperator {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(++a);   //preinkrementacja (najpierw podnosimy wartość o 1 a potem przypisujemy)
        System.out.println(a);

        int b = a++;             // postinkrementacja (najpierw przypisujemy a potem podnosimy wartość o 1)
        System.out.println(b);
        System.out.println(a);

        --a;                    //predekremrntacja
        a--;                    //postdekrementacja

        System.out.println(" ");


        int d = 4;
        System.out.println("d = " + d);
        System.out.println("Pre-incrementation d = " + ++d);

        int e = d++;
        System.out.println("e = " + d);
        System.out.println("Post-incrementation d = " + d++);



    }
}
