package dortUc.business.concrete;

import dortUc.business.abstracts.GamerCheckService;
import dortUc.entities.concrete.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
	
		return true;
	}


	}


