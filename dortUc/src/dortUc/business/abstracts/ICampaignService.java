package dortUc.business.abstracts;

import dortUc.entities.concrete.Campaign;

public interface ICampaignService {

	void add(Campaign campaign);

	void delete(Campaign campaign);
}
