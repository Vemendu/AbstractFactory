public class WoodenFurnitureFactory extends AbstractFactory{
    public Furniture getFurnitureType(String furnitureType)
    {
        if(furnitureType.equalsIgnoreCase("NORMAL CHAIR"))
            return new WoodenChair();
        else if(furnitureType.equalsIgnoreCase("NORMAL BED"))
            return new WoodenBed();
        return null;
    }
}
