package gameProject;

public class GameManager {
	public void add(Game game) {
		System.out.println(game.name + ": sisteme eklendi");
	}
	public void delete(Game game) {
		System.out.println(game.name + ": sistemden silindi");
	}
	
	public void update(Game game) {
		System.out.println(game.name + ":bilgileri güncellendi");
		
	}
}
