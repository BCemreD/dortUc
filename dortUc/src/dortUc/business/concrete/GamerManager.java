package dortUc.business.concrete;

import dortUc.business.abstracts.IGamerService;
import dortUc.entities.concrete.Gamer;

public class GamerManager implements IGamerService {

	@Override
	public void add(Gamer gamer) {
		
		System.out.println("Oyuncu eklendi:"+" "+gamer.getName());
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
