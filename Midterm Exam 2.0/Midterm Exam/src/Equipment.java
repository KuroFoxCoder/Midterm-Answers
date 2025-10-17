
public class Equipment extends SectionItem {
    private int weight;
    public void setWeight()
    {
        try
        {
            System.out.println("Enter weight of equipment: ");
            weight = input.nextInt();
            if(weight <= 0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: Invalid Weight Measurement");
            System.exit(1);
        }
    }
    public int getWeight()
    {
        return weight;
    }
    @Override
    public void printInfo()
    {
        System.out.println("Information:");
        System.out.println("   Equipment name: " + super.getName());
        System.out.println("   Equipment manufacturer: " + super.getCompany());
        System.out.println("   Weight: " + this.getWeight() + " lbs");
    }
}
