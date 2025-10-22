# bandages
```
public class Bandages extends Painkiller {
    private Boolean waterproof;

    public void setWaterproof()
    {
        System.out.print("Is the item waterproof? Y if yes, N if no: ");
        String water = input.next();
        if(water.equalsIgnoreCase("Y"))
        {
            waterproof = true;
        }
        if(water.equalsIgnoreCase("N"))
        {
            waterproof = false;
        }
        while(!water.equalsIgnoreCase("Y") || !water.equalsIgnoreCase("N") || water.length() > 1)
        {
            System.out.println("Invalid input. Is the item waterproof? Y if yes, N if no: ");
            water = input.next();
        }
    }
    public Boolean getWaterproof()
    {
        return waterproof;
    }
    public void printEvenMoreInfo()
    {
        super.printMoreInfo();
        System.out.println("   Is waterproof?:" + this.getWaterproof());
    }
}
```
# equipment
```

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
```
# painkiller
```
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
```
# sectionItem
```
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
```
# Main
```
import java.util.*;
void main() {
    Scanner input = new Scanner(System.in);
    int selection;
    ArrayList<Painkiller> inventoryOne = new ArrayList<>();
    ArrayList<Equipment> inventoryTwo = new ArrayList<>();
    ArrayList<Bandages> inventoryThree = new ArrayList<>();
    System.out.println("Select item type to add to inventory: " + "\n   1: Painkillers"  + "\n   2: Equipment" + "\n   3: Bandages");
    selection = input.nextInt();
    do{
        if (selection == 1) {
            System.out.println("Item: Painkiller");
            Painkiller nextItem = new Painkiller();
            nextItem.setName();
            nextItem.setCompany();
            nextItem.setExpiry();
            nextItem.setAgeGroup();
            inventoryOne.add(nextItem);
            System.out.println("Select next item category, or enter 4 to print current inventory list:" + "\n   1: Painkillers"  + "\n   2: Equipment" + "\n   3: Bandages");
            selection = input.nextInt();
        }
        if (selection == 2) {
            System.out.println("Item: Equipment");
            Equipment nextItem = new Equipment();
            nextItem.setName();
            nextItem.setCompany();
            nextItem.setWeight();
            inventoryTwo.add(nextItem);
            System.out.println("Select next item category, or enter 4 to print current inventory list:" + "\n   1: Painkillers"  + "\n   2: Equipment" + "\n   3: Bandages");
            selection = input.nextInt();
        }
        if (selection == 3) {
            System.out.println("Item: Bandages");
            Bandages nextItem = new Bandages();
            nextItem.setName();
            nextItem.setCompany();
            nextItem.setExpiry();
            nextItem.setAgeGroup();
            nextItem.setWaterproof();
            inventoryThree.add(nextItem);
            System.out.println("Select next item category, or enter any number to print current inventory list:" + "\n   1: Painkillers"  + "\n   2: Equipment" + "\n   3: Bandages");
            selection = input.nextInt();
        }
    }while(selection > 0 && selection < 4);
    if(inventoryOne.size() > 0) {
        for (int i = 0; i < inventoryOne.size(); i++) {
            inventoryOne.get(i).printMoreInfo();
        }
    }
    if(inventoryTwo.size() > 0) {
        for (int i = 0; i < inventoryOne.size(); i++) {
            inventoryTwo.get(i).printInfo();
        }
    }
    if(inventoryThree.size() > 0) {
        for (int i = 0; i < inventoryOne.size(); i++) {
            inventoryThree.get(i).printEvenMoreInfo();
        }
    }
}
```
