public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println("Dog says " + dog.speak());
        System.out.println("Cat says " + cat.speak());

        //final method
        System.out.println(dog.whoAreYou());
    }
}
