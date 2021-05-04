package gameProject;

public class Main {

	public static void main(String[] args) {
		Gamer halil=new Gamer(1, "halil", "Arslan","123456","06101995");
		
		GamerManager gamerManager=new GamerManager(new UserValidationManager());
		gamerManager.add(halil);
		
		Campaign campaign1 =new Campaign(1,10);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		Game dota=new Game(1, "Dota", 100);
		
		SaleManager saleManager=new SaleManager(campaignManager);
		
		saleManager.SaleGame(halil, dota, campaign1);
		
		
		
	}

}
