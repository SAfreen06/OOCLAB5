public class Clothing extends Product{
    private static final double TAX_RATE=0.10;
    public Clothing(String name, int stockQuantity, double unitPrice)
    {
        super(name, stockQuantity, unitPrice);
    }

    @Override
    public double calculateTotalPrice() {
        return getUnitPrice()+TAX_RATE*getUnitPrice();
    }
}
