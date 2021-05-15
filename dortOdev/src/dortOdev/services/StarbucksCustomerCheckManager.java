package dortOdev.services;

import dortOdev.abstracts.CustomerCheckManager;
import dortOdev.entities.Customer;
import dortOdev.interfaces.RealPersonService;
import dortOdev.interfaces.Result;

public class StarbucksCustomerCheckManager extends CustomerCheckManager{
private RealPersonService realPersonService;
	
	public StarbucksCustomerCheckManager(RealPersonService realPersonService){
		this.realPersonService = realPersonService;
	}
	
	@Override
	public Result CheckIfRealPerson(Customer customer) {
		
		return realPersonService.CheckIfRealPerson(customer);
	}
}
