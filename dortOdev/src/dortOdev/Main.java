package dortOdev;

import java.util.GregorianCalendar;


import dortOdev.adapters.MernisServiceAdapter;
import dortOdev.entities.Customer;
import dortOdev.interfaces.CustomerCheckService;
import dortOdev.interfaces.CustomerService;
import dortOdev.services.StarbucksCustomerCheckManager;
import dortOdev.services.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		

		Customer customer = new Customer();
	    customer.setId(1);
		customer.setIdentityNumber("000000000000");
		customer.setName("Cemre");
		customer.setLastName("DÝÞLÝ");
		customer.setBirthDate(new GregorianCalendar(1992, 04 , 06).getTime());
		
		CustomerCheckService customerCheckService = new StarbucksCustomerCheckManager(new MernisServiceAdapter());
		
		CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
		customerService.add(customer);
	
	
	}
}
