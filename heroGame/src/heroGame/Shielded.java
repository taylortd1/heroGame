package heroGame;

public class Shielded implements HeroState {

	Game g;
	
	public Shielded(Game g) {
		
		this.g = g;
	}
	
	public void Stand() {
		System.out.println("you are now standing.");
		g.setState(g.getStand());
	}
	
	public void Jump() {
		System.out.println("you cannot jump while shielded.");
	}
	
	public void Duck() {
		System.out.println("you cannot ducking while shielded.");
	}
	
	public void Dive() {
		System.out.println("you cannot dive while shielded.");
	}
	
	public void Shield() {
		System.out.println("you are already being shielded");
	}
	
	public void Dying() {
		
	}
}
