package dortUc.business.abstracts;

import dortUc.entities.concrete.Gamer;

public interface GamerCheckService {

	boolean CheckIfRealPerson(Gamer gamer);
}
