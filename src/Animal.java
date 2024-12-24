public class Animal {
    private String name;
    private int age;
    public static int weight = 17;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void eat() {
        System.out.println("eat");
    }
}
