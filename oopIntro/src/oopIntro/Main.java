package oopIntro;

public class Main {

	public static void main(String[] args) {
	Product product1=new Product();
	product1.setId(1);
	product1.setName("Lenove v14");
	product1.setUnitPrice(15000);
	product1.setDescription("16Gb Ram");
	Product product2=new Product();
	product2.setId(1);
	product2.setName("Lenove v15");
	product2.setUnitPrice(18000);
	product2.setDescription("32Gb Ram");
	product2.setDiscount(10);
	System.out.print(product2.getUnitPriceAfterDiscount());
	Product product3=new Product();
	product3.setId(1);
	product3.setName("HP");
	product3.setUnitPrice(8000);
	product3.setDescription("8Gb Ram");
	Product product4=new Product(4,"Monster",12000,"16Gb Ram",10,13500);
		Product[] products= {
				product1,product2,product3,product4
		};

System.out.println(products.length);
for(Product p:products)
{
	System.out.println(p.getName());
}
Category category1=new Category();
category1.setId(1);
category1.setName("Bilgisayar");
Category category2=new Category();
category2.setId(2);
category2.setName("Ev/yaþam");
	
ProductManager productManager=new ProductManager();
productManager.addToCart(product1);
productManager.addToCart(product2);
productManager.addToCart(product3);
productManager.addToCart(product4);

	}

}
