package labs_advanced.day_2.assignment_18;

public class Cat extends Animal implements PetAnimal
{
    Cat()
    {
        System.out.println("Hi i'm Cat");
    }
    Cat(String breed,int weight)
    {
        super(breed, weight);
        System.out.println("Hi i'm Cat");
    }
    @Override
    public void makeSound() {
        System.out.println("Meow Meow Meow .....");
    }
}
