package labs_advanced.day_2.assignment_18;

public class Starter {
    public static void main(String[] args) {
        Animal animal = new Dog("Pug", 30);
        Animal animal1 = new Cat();
        Cat cat = new Cat();
        Hippo hippo = new Hippo("Pygmy Hippo",1200);
        ((Dog) animal).makeSound();
        ((Cat) animal1).makeSound();
        cat.makeSound();
    }
}
