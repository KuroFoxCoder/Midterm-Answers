import java.util.Scanner;
public class SectionItem {
    private String name;
    private String company;
    Scanner input = new Scanner(System.in);
    public void setName()
    {
        String item;
        System.out.println("Enter item name: ");
        item = input.nextLine();
        name = item;
    }
    public void setCompany(){
        String maker;
        System.out.println("Enter company name: ");
        maker = input.nextLine();
        company = maker;
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
