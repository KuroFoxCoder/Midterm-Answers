
public class Equipment extends SectionItem {
    private int weight;
    public void setWeight()
    {
        System.out.println("Enter weight of equipment: ");
        weight = input.nextInt();
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
