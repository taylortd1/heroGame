package heroGame;

public class Ducking implements HeroState {

	Game g;
	
	public Ducking(Game g) {
		
		this.g = g;
	}
	
	public void Stand() {
		System.out.println("You are now standing.");
		g.setState(g.getStand());
	}
	
	public void Jump() {
		System.out.println("you cannot jump while ducking.");
	}
	
	public void Duck() {
		System.out.println("you are already ducking.");
	}
	
	public void Dive() {
		System.out.println("you cannot dive while ducking.");
	}
	
	public void Shield() {
		System.out.println("You are now being shielded");
		g.shieldCount = g.shieldCount - 1;
		g.setState(g.getShield());
	}
	
	public void Dying() {
		System.out.println("You died! GAME OVER!");
		System.exit(0);
	}
	
}
