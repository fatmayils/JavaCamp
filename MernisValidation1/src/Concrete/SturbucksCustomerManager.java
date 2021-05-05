package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService checkService;
	public SturbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	@Override
	public void save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("not a valid person");
		}
			
	}
	

}
