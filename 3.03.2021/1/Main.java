package pl.Skalinski;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
        dog.setMakeSound();
        dog.setName("palal");
        dog.setColor("gray");
        System.out.println(dog.helloAnimal());

        Cat cat = new Cat();
        cat.setMakeSound();
        cat.setName("kitty");
        cat.setColor("brown");
        System.out.println(cat.helloAnimal());
    }
}
