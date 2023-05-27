public class Penguin extends Bird
{
    public Penguin(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A PENGUIN ARRIVES");
    }
    public Penguin(){}
    public void fish()
    {
        System.out.println("The penguin fishes.");
    }
}
