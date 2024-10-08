package Lab5Task;

import java.util.Comparator;
import java.util.List;

public class OrderManager {
    private List<Product> productList;

    public OrderManager(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> sortProducts()
    {
        productList.sort(Comparator.comparing(Product::calculateTotalPrice)
                .thenComparing(Product::getName)
                .thenComparing(Product::getStockQuantity));

        return productList;
    }

    public void showProduct()
    {
        for(Product products: productList)
        {
            System.out.println("Lab5Task.Product name:"+products.getName()
                    +" Unit price:"+products.getUnitPrice()+
                    " Stock quantity:"+products.getStockQuantity());
        }
    }
}
