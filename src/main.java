public class main {
    public static void main(String[] args) {
        AbstractFactory furnitureFactory = FactoryProducer.getFactory("Wooden");
        Furniture furniture1 = furnitureFactory.getFurnitureType("NORMAL CHAIR");
        Furniture furniture2 = furnitureFactory.getFurnitureType("NORMAL BED");
        furniture1.description();
        furniture2.description();
    }
}
