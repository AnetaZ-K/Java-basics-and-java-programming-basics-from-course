package advanced;

public class DogPlayground {
    public static void main(String[] args) {
        Dog burek = new Dog();
        burek.setName("Burek");
        String name = burek.getName();
        System.out.println(name);
        burek.bark();

        Dog laser = new Dog();
        laser.setName("Laser");
        laser.bark();

        burek.bark();

        Dog azor = new Dog ();
        azor.name = "Azor";
        String dogName = azor.name;
        System.out.println("azor.name = " + azor.name);

        azor.setAge(4);
        System.out.println("azor.getAge() = " + azor.getAge());
        //azor.validateAge(4)


        advanced.dog.Dog dog = new advanced.dog.Dog();
        dog.setBreed("Pitbull");
        System.out.println(dog.getBreed());
    }



}
