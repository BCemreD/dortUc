package dortOdev.abstracts;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import dortOdev.entities.Customer;
import dortOdev.interfaces.CustomerCheckService;
import dortOdev.interfaces.Result;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public Result CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return new dortOdev.utils.Result(true);
	}

	@Override
	public final Result CheckIfYoungerAgeThan(Customer customer, int age) {
		LocalDate todayDateTime = LocalDate.now();
		LocalDate birthDate = customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int yearDifference = Period.between(birthDate, todayDateTime).getYears();
		if(yearDifference < age) {
			return new dortOdev.utils.Result(false, age + " yaþýndan küçük olamaz.");
		}
		return new dortOdev.utils.Result(true);
	}

}
