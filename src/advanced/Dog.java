package advanced;

public class Dog {
    public String name; // possible but not use in practice. Fields are always private by convention
    private int age;
    public void  bark(){
        System.out.println(name + " is doing Hau hau");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if(validateAge(age)){
            this.age = age;
        } else {
            System.out.println("ERROE: Age "  + age + "is invalid" );
        }
    }
    public int getAge(){
        return age;
    }

    private boolean validateAge (int age){
        return age> 0 && age <30;
    }
}
