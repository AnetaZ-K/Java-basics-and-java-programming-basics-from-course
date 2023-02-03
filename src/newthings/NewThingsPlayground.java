package newthings;

import advanced.Dog;

import java.time.LocalDate;

public class NewThingsPlayground {
    public static void main(String[] args) {
        var text = "String";
        System.out.println(text.toLowerCase());
        var dog = new Dog();
        dog.setName("Piżmak");
        System.out.println(dog.getName());

        LocalDate now = LocalDate.now();
        boolean isItWeekend = switch (now.getDayOfWeek()) {
            case FRIDAY, SATURDAY, SUNDAY -> true;
            default -> false;
        };

        System.out.println("isItWeekend = " + isItWeekend);
    }
}