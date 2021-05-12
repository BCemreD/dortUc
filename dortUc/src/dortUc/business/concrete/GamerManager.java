package dortUc.business.concrete;

import dortUc.business.abstracts.GamerCheckService;
import dortUc.business.abstracts.IGamerService;
import dortUc.entities.concrete.Gamer;

public class GamerManager implements IGamerService {

private GamerCheckService gamerCheckService;
	

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
		System.out.println("Oyuncu eklendi:"+" "+gamer.getName());
	}else {
		System.out.println("Oyuncu bulunamadý");}
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Oyuncu bilgileri güncellendi:"+" "+gamer.getName());
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Oyuncu silindi:"+" "+gamer.getName());
	}

}
