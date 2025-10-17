import java.util.Scanner;
public class SectionItem {
    private String name;
    private String company;
    Scanner input = new Scanner(System.in);
    public void setName()
    {
        String item;
        try {
            System.out.println("Enter item name: ");
            item = input.nextLine();
            if(item.isEmpty())
            {
                throw new IllegalArgumentException();
            }
            name = item;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: Item name cannot be empty");
            System.exit(1);
        }
    }
    public void setCompany(){
        String maker;
        try {
            System.out.println("Enter company name: ");
            maker = input.nextLine();
            if(maker.isEmpty())
            {
                throw new IllegalArgumentException();
            }
            company = maker;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: Company name cannot be empty");
            System.exit(1);
        }
    }
    public String getName()
    {
        return name;
    }
    public String getCompany()
    {
        return company;
    }
    public void printInfo()
    {
        System.out.println("Information: ");
        System.out.println("   Drug name: " + name);
        System.out.println("   Company name: " + company);
    }
}
