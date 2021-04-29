package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	Product product1=new Product();
	product1.id=1;
	product1.name="Lenove v14";
	product1.unitPrice=15000;
	product1.description="16Gb Ram";
	Product product2=new Product();
	product2.id=1;
	product2.name="Lenove v15";
	product2.unitPrice=18000;
	product2.description="32Gb Ram";
	Product product3=new Product();
	product3.id=1;
	product3.name="HP";
	product3.unitPrice=8000;
	product3.description="8Gb Ram";
	Product product4=new Product(4,"Monster",12000,"16Gb Ram");
		Product[] products= {
				product1,product2,product3,product4
		};

System.out.println(products.length);
for(Product p:products)
{
	System.out.println(p.name);
}
Category category1=new Category();
category1.id=1;
category1.name="Bilgisayar";
Category category2=new Category();
category2.id=2;
category2.name="Ev/yaþam";
	
ProductManager productManager=new ProductManager();
productManager.addToCart(product1);
productManager.addToCart(product2);
productManager.addToCart(product3);
productManager.addToCart(product4);

	}

}
