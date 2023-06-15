package heroGame;

public class Die implements HeroState{

	Game g;
	
	public Die(Game g) {
		this.g = g;
	}
	
	public void Stand() {
		System.out.println("You are dead,you can't do that!");
	}
	
	public void Jump() {
		System.out.println("You are dead,you can't do that!");
	}
	
	public void Duck() {
		System.out.println("You are dead,you can't do that!");
	}
	
	public void Dive() {
		System.out.println("You are dead,you can't do that!");
	}
	
	public void Shield() {
		System.out.println("You are dead,you can't do that!");
	}
	
	public void Dying() {
		System.out.println("You died!! GAME OVER");
		System.exit(0);
	}
}
