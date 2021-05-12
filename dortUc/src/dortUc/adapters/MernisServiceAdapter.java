package dortUc.adapters;

import java.rmi.RemoteException;

import dortUc.business.abstracts.GamerCheckService;
import dortUc.entities.concrete.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.nationalIdentity), gamer.name.toUpperCase(), 
					gamer.lastName.toUpperCase(), 1992);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
