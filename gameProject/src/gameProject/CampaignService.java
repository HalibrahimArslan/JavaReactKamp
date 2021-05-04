package gameProject;

public interface CampaignService {
	int calculateOfPrice(Game game,Campaign campaign);
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	
}
