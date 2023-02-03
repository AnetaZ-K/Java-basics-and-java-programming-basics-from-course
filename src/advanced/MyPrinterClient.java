package advanced;

public class MyPrinterClient {
    public static void main(String[] args) {
        MyPrinter.printNumber(10);

       // MyPrinter printer = new MyPrinter();
        MyPrinter.printNumber(12);
        //printer.printNumber(12);

        //printer.setId("cannon 5th floor");

        MyPrinter myPrinter = new MyPrinter();
        MyPrinter myPrinter1 = new MyPrinter();

        MyPrinter.printCounter();

    }
}
