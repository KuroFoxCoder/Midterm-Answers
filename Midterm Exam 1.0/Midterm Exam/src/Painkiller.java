public class Painkiller extends SectionItem {
    private String expiry;
    private String ageGroup;

    public void setExpiry()
    {
        System.out.print("Enter Expiration Date: ");
        expiry = input.nextLine();
    }
    public void setAgeGroup()
    {
        System.out.print("Enter recommended age group for use of item: ");
        ageGroup = input.nextLine();
    }
    public String getExpiry()
    {
        return expiry;
    }
    public String getAgeGroup()
    {
        return ageGroup;
    }
    public void printMoreInfo()
    {
        super.printInfo();
        System.out.println("   Expiration date: " + this.getExpiry());
        System.out.println("   Recommended Age Group for Use: " + this.getAgeGroup());
    }
}
