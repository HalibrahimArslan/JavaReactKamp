package gameProject;

public class GamerManager {
	UserValidation userValidation;

	public GamerManager(UserValidation userValidation) {
		
		this.userValidation = userValidation;
	}
	
	public void add(Gamer gamer) {
		if(userValidation.chechIfRealPerson(gamer)) {
			System.out.println(gamer.firstName+": eklendi");
		}
	}
	
	public void delete(Gamer gamer) {
		if(userValidation.chechIfRealPerson(gamer)) {
			System.out.println(gamer.firstName+": silindi");
		}
	}
	
	public void update(Gamer gamer) {
		if(userValidation.chechIfRealPerson(gamer)) {
			System.out.println(gamer.firstName+": güncellendi");
		}
	}
	

}
