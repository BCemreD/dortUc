package dortUc.business.concrete;

import dortUc.business.abstracts.IOrderService;
import dortUc.entities.concrete.Campaign;
import dortUc.entities.concrete.Gamer;
import dortUc.entities.concrete.Order;

public class OrderManager implements IOrderService {

	@Override
	public void add(Order order) {
		System.out.println("Satýn alma tamamlandý");
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Güncelleme yükseltildi");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Satýn alma iptal edildi");
		
	}

	@Override
	public void sale(Order order, Gamer gamer) {
		System.out.println("Satýn alma"+" "+gamer.getName()+" "+
	gamer.getLastName()+" "+"tarafýndan gerçekleþtirildi");
		
	}

	@Override
	public void campaign(Order order, Campaign campaign, Gamer gamer) {
		System.out.println("Satýn alma"+" "+campaign.getSaleRate()+" "+"indirimle"+" "+gamer.getName()+" "+
	gamer.getLastName()+" "+"tarafýndan gerçekleþti");
		
	}

}
