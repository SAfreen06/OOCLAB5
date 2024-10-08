package UnitTesting;

import Lab5Task.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductTesting {



@Test
public void ElectronicsTotalPrice(){
    Product television=new Electronics("Television",5,40000);
    int expectedTvTotal=46000;
    assertEquals(expectedTvTotal,television.calculateTotalPrice(),0.0);
}

@Test
public void ClothingTotalPrice(){
    Product shirt=new Clothing("Shirt",15,2000);
    int expectedShirtTotal=2200;
    assertEquals(expectedShirtTotal,shirt.calculateTotalPrice(),0.0);
}

@Test
public void FurnitureTotalPrice(){
    Product table=new Furniture("Table",10,4000);
    int expectedTableTotal=4320;
    assertEquals(expectedTableTotal,table.calculateTotalPrice(),0.0);
}

@Test
    public void SortingByPriceTest(){
    List<Product>products=new ArrayList<>();
    products.add(new Electronics("radio",2,1000));
    products.add(new Clothing("sharee",2,100));
    products.add(new Furniture("chair",5,1200));
    OrderManager om=new OrderManager(products);
    om.sortProducts();
    int expextedFirstPrice=110;
    assertEquals(expextedFirstPrice,products.get(0).calculateTotalPrice(),0.0);
}
@Test
    public void SortingByProductName(){
    List<Product>products=new ArrayList<>();
    products.add(new Electronics("Tv",2,1000));
    products.add(new Clothing("Shirt",5,1000));
    products.add(new Furniture("Chair",5,1000));
    OrderManager om=new OrderManager(products);
    om.sortProducts();
    String expectedFirstName="Chair";
    assertEquals(expectedFirstName,products.get(0).getName());
}

@Test
    public void SortingByStockQuantity(){
    List<Product>products=new ArrayList<>();
    products.add(new Electronics("Tv",2,0));
    products.add(new Clothing("Tv",10,0));
    products.add(new Furniture("Tv",5,0));
    OrderManager om=new OrderManager(products);
    om.sortProducts();
    int expectedFirstQuantity=2;
    assertEquals(expectedFirstQuantity,products.get(0).getStockQuantity());
}
}

