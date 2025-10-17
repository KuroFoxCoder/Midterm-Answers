public class Painkiller extends SectionItem {
    private String expiry;
    private String ageGroup;

    public void setExpiry()
    {
        try {
            System.out.print("Enter Expiration Date: ");
            expiry = input.nextLine();
            if(expiry.isEmpty())
            {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("ERROR: Expiration date cannot be empty");
            System.exit(1);
        }
    }
    public void setAgeGroup()
    {
        try {
            System.out.print("Enter recommended age group for use of item: ");
            ageGroup = input.nextLine();
            if(ageGroup.isEmpty())
            {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("ERROR: Age group cannot be empty.");
            System.exit(1);
        }
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
