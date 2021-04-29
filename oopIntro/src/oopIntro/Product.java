package oopIntro;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private String description;
	private double discount;
	private double unitPriceAfterDiscount;
	public Product() {
		System.out.println("ben çalýþtým");
	}
	public Product(int id,String name,double unitPrice,String description,double discount,double unitPriceAfterDiscount) {
		super();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.description=description;
		this.discount=discount;
		this.unitPriceAfterDiscount=unitPriceAfterDiscount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
