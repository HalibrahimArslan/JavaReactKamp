package gameProject;

public class UserValidationManager implements UserValidation {

	@Override
	public boolean chechIfRealPerson(Gamer gamer) {
		if(gamer.firstName=="halil" && gamer.nationalityId=="123456") {
			return true;
		}
		else {
			return false;
		}
		
	}

}
