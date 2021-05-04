package gameProject;

public class SaleManager implements SaleService {
	
	CampaignService campaignService;
	

	public SaleManager(CampaignService campaignService) {
	
		this.campaignService = campaignService;
	}


	@Override
	public void SaleGame(Gamer gamer, Game game, Campaign campaign) {
		
		int lastAmount=campaignService.calculateOfPrice(game,campaign);
		
		System.out.println(game.name + " isimli oyun " + gamer.firstName + " isimli kullanýcýya " +
		lastAmount + " fiyata satýþ yapýldý. ");
		
	}


	@Override
	public void SaleGame(Gamer gamer, Game game) {
		
		System.out.println(game.name + " isimli oyun " + gamer.firstName + " isimli kullanýcýya " +
				game.price + " fiyata satýþ yapýldý. ");
		
	}

}
