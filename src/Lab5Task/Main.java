package Lab5Task;

import Lab5Task.Clothing;
import Lab5Task.Electronics;
import Lab5Task.Furniture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product electronics=new Electronics("Television",5,70000);
        Product clothing=new Clothing("Shirt",15,2000);
        Product furniture=new Furniture("Table",10,4000);

    }
}