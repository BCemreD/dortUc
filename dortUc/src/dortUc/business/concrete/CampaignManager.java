package dortUc.business.concrete;

import dortUc.business.abstracts.ICampaignService;
import dortUc.entities.concrete.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya iptal edildi");
		
	}

}
