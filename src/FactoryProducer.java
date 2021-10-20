public class FactoryProducer {
    public static AbstractFactory getFactory (String type)
    {
        if(type.equalsIgnoreCase("METALLIC"))
            return new MetallicFurnitureFactory();
        else if(type.equalsIgnoreCase("WOODEN"))
            return new WoodenFurnitureFactory();
        return null;
    }
}
