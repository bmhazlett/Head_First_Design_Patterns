public class AnimalTest {
    public static void main(String[] args) {
	Dog d = new Dog();
	d.bark();

	Animal animal = new Dog();
	animal.makeSound();

	Animal c = new Cat();
	c.makeSound();
    }
}
