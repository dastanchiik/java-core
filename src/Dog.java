public class Dog extends Animal{
    private String breed;
    private static int year;

    public Dog(String name, int age, String breed, int year) {
        super(name, age);
        this.breed = breed;
        this.year = year;
    }
}
