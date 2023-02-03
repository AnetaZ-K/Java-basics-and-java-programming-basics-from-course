package fundamentals;

public class Conversions {
    public static void main(String[] args) {
        int a = 25;
        System.out.println( "int a = " + a );
        float b = a;
        System.out.println("float b = " + b);

        System.out.println(" ");

        byte c = 127;
        System.out.println(" byte c = " + c);
        short d = c;
        System.out.println(" short d = " + d);
        int e = d;
        System.out.println(" int e = " + e);
        long f = e;
        System.out.println(" long f = " + f);

        // c = f won't compile due to lose of precision

        System.out.println(" ");

        float g = 5.0f;
        System.out.println("float g = " + g);
        double h =g;
        System.out.println("double h = " + h);

        //float floatValue = h; -> won't compile due to lose of precision

        System.out.println(" ");
        int i = 10;
        System.out.println("i = " + i);

        int j = 3;
        System.out.println("j = " + j);
        double l = j;
        System.out.println("l = " + l);

       double k = l/i;
        System.out.println("k = " + k);

    }
}
