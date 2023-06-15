package heroGame;

public class Diving implements HeroState {

	Game g;
	
	public Diving(Game g) {
		this.g = g;
	}
	
	public void Stand() {
		System.out.println("You are now Standing.");
		g.setState(g.getStand());
	}
	
	public void Jump() {
		System.out.println("You are now jumping.");
		g.setState(g.getJump());
		
	}
	
	public void Duck() {
		System.out.println("Cannot Duck while diving!");
	}
	
	public void Dive() {
		System.out.println("You are Already diving");
	}
	
	public void Shield() {
		System.out.println("You are now being shielded.");
		g.shieldCount = g.shieldCount - 1;
		g.setState(g.getShield());
		
	}
	
	public void Dying() {
		System.out.println("You died!! GAME OVER");
		System.exit(0);
	}
	
}
