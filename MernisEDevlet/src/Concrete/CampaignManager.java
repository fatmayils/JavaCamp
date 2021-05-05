package Concrete;

import java.util.ArrayList;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{
ArrayList<Campaign> campaigns=new ArrayList<Campaign>();
	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi:"+campaign.getCampaignName());
		campaigns.add(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi:"+campaign.getCampaignName());
		campaigns.remove(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi:"+campaign.getCampaignName());
		
	}

	@Override
	public void list() {
		System.out.println("Kampanyalar listeleniyor.....");
		for(Campaign campaign:campaigns)
		{
			System.out.println(campaign.getCampaignName());
		}
		System.out.println("Listelenme bitti.....");
	}

}
