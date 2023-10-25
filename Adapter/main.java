public class main {
    public static void main(String[] args) throws Exception {
        Animal person = new Person();
        Animal dog    = new Dog();
        Animal bird   = new Bird();

        System.out.println("Test Person");
        person.makeSound();
        person.move();

        System.out.println("Test Dog");
        dog.makeSound();
        dog.move();

        System.out.println("Test Bird");
        bird.makeSound();
        bird.move();

    }
}
