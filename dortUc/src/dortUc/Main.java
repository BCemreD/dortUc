package dortUc;

import dortUc.business.concrete.GamerManager;
import dortUc.business.concrete.OrderManager;
import dortUc.entities.concrete.Gamer;
import dortUc.entities.concrete.Order;

public class Main {

	public static void main(String[] args) {
	GamerManager gamerManager = new GamerManager ();
	gamerManager.add(new Gamer(1,"Cemre","DÝÞLÝ","cemre@cemre.com",123456));
	
	
	OrderManager orderManager = new OrderManager();
	orderManager.add(new Order(2,"Last of Us","Surive",200));
	
	OrderManager orderManager2 = new OrderManager();
	orderManager2.sale(new Order(2,"Last of Us","Surive",200), 
			new Gamer(1,"Cemre","DÝÞLÝ","cemre@cemre.com",123456));
	}
}
