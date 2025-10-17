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
            System.out.println("Select next item category, or enter any number to print current inventory list:" + "\n   1: Painkillers"  + "\n   2: Equipment" + "\n   3: Bandages");
            selection = input.nextInt();
        }
        if (selection == 2) {
            System.out.println("Item: Equipment");
            Equipment nextItem = new Equipment();
            nextItem.setName();
            nextItem.setCompany();
            nextItem.setWeight();
            inventoryTwo.add(nextItem);
            System.out.println("Select next item category, or enter any number to print current inventory list:" + "\n   1: Painkillers"  + "\n   2: Equipment" + "\n   3: Bandages");
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
