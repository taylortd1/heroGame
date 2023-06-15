package heroGame;

public class Standing implements HeroState {

	Game g;
	
	public Standing(Game g) {
		
		this.g = g;
	}
	
	public void Stand() {
		System.out.println("You are already standing.");
	}
	
	public void Jump() {
		System.out.println("you are now jumping.");
		g.setState(g.getJump());
	}
	
	public void Duck() {
		System.out.println("you are now ducking.");
		g.setState(g.getDuck());
	}
	
	public void Dive() {
		System.out.println("you are now diving.");
		g.setState(g.getDive());
	}
	
	public void Shield() {
		System.out.println("you are now shielded");
		g.setState(g.getShield());
	}
	
	public void Dying() {
		System.out.println("you died!GAME OVER!");
		System.exit(0);
	}
}
