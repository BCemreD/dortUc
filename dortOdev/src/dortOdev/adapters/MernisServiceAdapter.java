package dortOdev.adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import dortOdev.entities.Customer;
import dortOdev.interfaces.RealPersonService;
import dortOdev.interfaces.Result;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements RealPersonService{

	@Override
	public Result CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getIdentityNumber()),
					customer.getName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result) {
			return new dortOdev.utils.Result(true);
		}else {
			return new dortOdev.utils.Result(false, "kimlik doðrulama baþarýsýz.");
		}
	}

}
