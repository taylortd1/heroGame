package heroGame;

public class Hero{

	protected String name;
	protected int shieldCount;
	protected boolean alive;
	
	public Hero(String name) {
		this.name = name;
		shieldCount = 2;
		alive = true;
	}

}
