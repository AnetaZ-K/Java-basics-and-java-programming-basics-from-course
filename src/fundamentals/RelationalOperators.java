package fundamentals;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        int b = 6;
        System.out.println(b);

        boolean result = a == b; //równe
        System.out.println("a == b " + result );

        boolean result1 = a !=b;  //różne
        System.out.println("a !=b " + result1);

        boolean result2 = a < b; //mniejsze
        System.out.println("a < b " + result2 );

        boolean result3 = a <= b;
        System.out.println("a <= b " + result3);   // mniejsze lub równe

        boolean result4 = a > b;
        System.out.println("a > b " + result4);     // większe

        boolean result5 = a >= b;
        System.out.println("a >= b " + result5);    // większe lub równe


    }
}
