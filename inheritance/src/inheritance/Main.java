package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin=new IndividualCustomer();
		engin.setCustomerNumber("12345");
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.setCustomerNumber("67890");
		SendikaCustomer sendika=new SendikaCustomer();
		sendika.setCustomerNumber("60001");
		CustomerManager customer=new CustomerManager();
		//customer.add(hepsiBurada);
		//customer.add(engin);
		//customer.add(sendika);
		Customer[] customers= {
				engin,hepsiBurada,sendika
		};
		customer.addMultiple(customers);
				
		
	}

}
