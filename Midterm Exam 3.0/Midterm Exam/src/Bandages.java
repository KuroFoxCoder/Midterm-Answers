public class Bandages extends Painkiller {
    private Boolean waterproof;

    public void setWaterproof()
    {
        try {
            System.out.print("Is the item waterproof? Y if yes, N if no: ");
            String water = input.next();
            if (!water.equalsIgnoreCase("Y") && !water.equalsIgnoreCase("N")) {
                throw new CustomBooleanException();
            }
            if (water.equalsIgnoreCase("Y")) {
                waterproof = true;
            }
            if (water.equalsIgnoreCase("N")) {
                waterproof = false;
            }
        }
        catch(CustomBooleanException e)
        {
            System.out.println("ERROR: invalid input.");
            System.exit(1);
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
    public class CustomBooleanException extends Exception
    {
        public CustomBooleanException()
        {

        }
    }
}
