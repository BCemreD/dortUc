package dortUc;

import dortUc.business.concrete.GamerManager;
import dortUc.business.concrete.OrderManager;
import dortUc.entities.concrete.Campaign;
import dortUc.entities.concrete.Gamer;
import dortUc.entities.concrete.Order;
import dortUc.adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
	GamerManager gamerManager = new GamerManager (new MernisServiceAdapter());
	gamerManager.add(new Gamer(1, "14052369852", "Cemre", "DÝÞLÝ", "cemre@cemre.com", 1992, 123456));
	
	
	OrderManager orderManager = new OrderManager();
	orderManager.add(new Order(2,"Last of Us","Surive",200));
	
	OrderManager orderManager2 = new OrderManager();
	orderManager2.sale(new Order(2,"Last of Us","Surive",200), 
			new Gamer(1, "14052369852", "Cemre", "DÝÞLÝ", "cemre@cemre.com", 1992, 123456));
	
	OrderManager orderManager3 = new OrderManager();
	orderManager3.campaign(new Order(3,"Terraria","Surive",20), new Campaign(1,10,"Hoþgeldin indirimi"),
			new Gamer(1, "14052369852", "Cemre", "DÝÞLÝ", "cemre@cemre.com", 1992, 123456));
	
	}
}
