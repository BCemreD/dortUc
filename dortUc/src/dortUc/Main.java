package dortUc;

import dortUc.business.concrete.GamerManager;
import dortUc.entities.Gamer;

public class Main {

	public static void main(String[] args) {
	GamerManager gamerManager = new GamerManager ();
	gamerManager.add(new Gamer(1,"Cemre","DÝÞLÝ","cemre@cemre.com",123456));
	}

}
