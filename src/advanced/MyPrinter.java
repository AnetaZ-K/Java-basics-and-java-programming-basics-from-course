package advanced;

public class MyPrinter {

    private static int counter;
   // private static String id;
    static void printNumber(int number){
       // System.out.println(id);
        System.out.println(number);
    }
   /* public static void setId(String staticId){
       id = staticId;
    }*/
   static void printCounter() {
       System.out.println("counter = " + counter);
   }

    public MyPrinter() {
        counter++;
    }
}
