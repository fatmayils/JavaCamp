package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class OrderManager implements OrderService{

	@Override
	public void saleWithCampaign(Member member, Game game, Campaign campaign) {
		double newPrice=game.getPrice()-(game.getPrice()*campaign.getRate()/100);
		System.out.println(member.getFirstName()+
				" "+game.getGameName()+" oyununu "+campaign.getCampaignName()+" kampanyas�yla "+newPrice+" tl ye sat�n ald�.\n"+"Oyunun kampanyas�z fiyat� "+game.getPrice()+" tl dir.");
	}

	@Override
	public void saleWithNoCampaign(Member member, Game game) {
		System.out.println(member.getFirstName()+
				" "+game.getGameName()+" oyununu "+game.getPrice()+" tl ye sat�n ald�.");
		
	}

}
