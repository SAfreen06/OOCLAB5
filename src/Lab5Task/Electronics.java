package Lab5Task;

public class Electronics extends Product {
private static final double TAX_RATE=0.15;
    public Electronics(String name, int stockQuantity, double unitPrice){
        super(name, stockQuantity, unitPrice);
    }

    public double calculateTotalPrice()
    {
        return getUnitPrice()+TAX_RATE*getUnitPrice();
    }

}
