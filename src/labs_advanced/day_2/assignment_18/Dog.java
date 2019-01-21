package labs_advanced.day_2.assignment_18;

public class Dog extends Animal implements PetAnimal
{
    Dog()
    {
        System.out.println("Hi I'm Dog");
    }
    Dog(String breed,int weight)
    {
        super(breed,weight);
        System.out.println("Hi I'm Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("bow bowbow bow .....");
    }
}
