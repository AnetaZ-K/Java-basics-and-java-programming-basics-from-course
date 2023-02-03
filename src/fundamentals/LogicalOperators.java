package fundamentals;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean boolValue1 = true;
        System.out.println("boolValue1 = " + boolValue1);
        boolean boolValue2 = false;
        System.out.println("boolValue2 = " + boolValue2);

        boolean result = boolValue1 && boolValue2;
        System.out.println("result true && false = " + result);

        boolean result2 = boolValue1 && boolValue1;
        System.out.println("result true && true = " + result2);

        System.out.println("|| operator");
        boolean result3 = true || false;
        System.out.println("result3 true || false " + result3);

        boolean result4 = false || false;                              //result.soutv --> System.out.println("result")
        System.out.println("result4 false || false " + result4);

        System.out.println("! operator");
        boolean result5 = !boolValue1;
        System.out.println("result5 = " + result5);


    }
}
