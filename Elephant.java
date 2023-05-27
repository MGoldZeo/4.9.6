public class Elephant extends Hooved
{
    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("AN ELEPHANT HAS ARRIVED!!");
    }
    public Elephant(){}
    public void trumpet()
    {
        System.out.println("The elephant trumpets.");
    }
    public String toString()
    {
        return "This is an object of the Elephant class.";
    }
}
