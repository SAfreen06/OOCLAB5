package Lab5Task;

public class Furniture extends Product {
    private static final double TAX_RATE=0.08;

    public Furniture(String name, int stockQuantity , double unitPrice)
    {
        super(name,stockQuantity,unitPrice);
    }

    @Override
    public double calculateTotalPrice() {
        return getUnitPrice()+TAX_RATE*getUnitPrice();
    }
}
