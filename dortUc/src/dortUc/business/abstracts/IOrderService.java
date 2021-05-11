package dortUc.business.abstracts;

import dortUc.entities.concrete.Campaign;
import dortUc.entities.concrete.Gamer;
import dortUc.entities.concrete.Order;

public interface IOrderService {

	void add(Order order);
	void update(Order order);
	void delete(Order order);
	void sale(Order order, Gamer gamer);
	void campaign(Order order, Campaign campaign, Gamer gamer);
	
}
