import java.util.*;

class Product{
    String name;
    double price;
    static int totalProduct = 0;
    public Product(String n,double p){
        name = n;
        price = p;
        totalProduct++;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(double p){
        price = p;
    }
    public static int getTotalProducts(){
        return totalProduct;
    }
}


public class Lab_7_1
{
	public static void main(String[] args) {
	    
	    Product p1 = new Product("phone",20000);
	    System.out.println("Product name = "+p1.name);
	    System.out.println("Product price = "+p1.price);
	    p1.setPrice(21000);
	    p1.setName("OPPO A15s");
	    System.out.println("Updated values");
	    System.out.println("Product name = "+p1.name);
	    System.out.println("Product price = "+p1.price);
	    System.out.println("Total Number of Products = "+Product.getTotalProducts());
	    
	    
	}
}
