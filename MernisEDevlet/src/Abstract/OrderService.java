package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface OrderService {
	void saleWithCampaign(Member member,Game games,Campaign campaign);
	void saleWithNoCampaign(Member member,Game games);
}
