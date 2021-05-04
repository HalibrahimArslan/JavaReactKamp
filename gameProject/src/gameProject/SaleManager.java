package gameProject;

public class SaleManager implements SaleService {
	
	CampaignService campaignService;
	

	public SaleManager(CampaignService campaignService) {
	
		this.campaignService = campaignService;
	}


	@Override
	public void SaleGame(Gamer gamer, Game game, Campaign campaign) {
		
		int lastAmount=campaignService.calculateOfPrice(game,campaign);
		
		System.out.println(game.name + " isimli oyun " + gamer.firstName + " isimli kullan�c�ya " +
		lastAmount + " fiyata sat�� yap�ld�. ");
		
	}


	@Override
	public void SaleGame(Gamer gamer, Game game) {
		
		System.out.println(game.name + " isimli oyun " + gamer.firstName + " isimli kullan�c�ya " +
				game.price + " fiyata sat�� yap�ld�. ");
		
	}

}
