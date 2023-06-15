package heroGame;

public class Jumping implements HeroState {

	Game g;
	
	public Jumping(Game g) {
		
		this.g = g;
	}
	
	public void Stand() {
		System.out.println("you are now standing.");
		g.setState(g.getStand());
	}
	
	public void Jump() {
		System.out.println("you are already jumping!");
	}
	
	public void Duck() {
		System.out.println("you cannot duck while jumping.");
	}
	
	public void Dive() {
		System.out.println("you cannot dive while jumping.");
	}
	
	public void Shield() {
		System.out.println("you are now being shielded.");
		g.setState(g.getShield());
	}
	
	public void Dying() {
		System.out.println("you died!GAME OVER!");
		System.exit(0);
	}
}
