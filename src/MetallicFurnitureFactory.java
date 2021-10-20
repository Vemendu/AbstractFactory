public class MetallicFurnitureFactory extends AbstractFactory{
    public Furniture getFurnitureType(String furnitureType)
    {
        if(furnitureType.equalsIgnoreCase("COLD CHAIR, HARD TO BREAK"))
            return new MetallicChair();
        else if(furnitureType.equalsIgnoreCase("COLD BED, HARD TO BREAK"))
            return new MetallicBed();
        return null;
    }
}
