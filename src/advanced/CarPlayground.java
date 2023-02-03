package advanced;

public class CarPlayground {
    public static void main(String[] args) {
        Car car = new Car("WERWE124323", "White", 185);
        /*car.setVin("WERWE124323");
        car.setColor("White");
        car.setMaxSpeed(185);*/
        car.printCarDetails();
        System.out.println(car);

        Car car1 = new Car("ASDF12342134", "Golden");
        System.out.println(car1);

        /* System.out.println(car.getVin());
        System.out.println(car.getColor());
        System.out.println(car.getMaxSpeed());
        */

        //System.out.println(car.toString());


    }
}
