import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new SturbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Fatma Gül","Yýldýrým",new Date(2000,11,13),"*************"));
		
	
	}

}
