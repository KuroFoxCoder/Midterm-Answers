public class Bandages extends Painkiller {
    private Boolean waterproof;

    public void setWaterproof()
    {
        System.out.print("Is the item waterproof? Y if yes, N if no: ");
        String water = input.next();
        while(!water.equalsIgnoreCase("Y") || !water.equalsIgnoreCase("N") || water.length() > 1)
        {
            System.out.println("Invalid input. Is the item waterproof? Y if yes, N if no: ");
            water = input.next();
        }
        if(water.equalsIgnoreCase("Y"))
        {
            waterproof = true;
        }
        if(water.equalsIgnoreCase("N"))
        {
            waterproof = false;
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
