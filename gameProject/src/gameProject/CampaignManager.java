package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public int calculateOfPrice(Game game, Campaign campaign) {
		return game.price-(game.price/100*campaign.discount);
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.id + "numaralý kampanya sisteme eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.id + "numaralý kampanya sistemden silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.id + "numaralý kampanya güncellendi");
		
	}

}
