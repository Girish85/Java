package labs_advanced.day_2.assignment_18;

public class Animal {
    String breed;
    int weight;
    Animal()
    {
        System.out.println("Hi I'm Animal");
    }
    Animal(String breed,int weight)
    {
        System.out.println("Hi I'm Animal");
        this.breed = breed;
        this.weight = weight;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getWeight()
    {
        return weight;
    }
}
