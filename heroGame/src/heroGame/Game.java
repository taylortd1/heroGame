package heroGame;

public class Game {

	protected int shieldCount = 2;
	protected boolean alive = true;
	protected Hero hero;
	
	protected HeroState stand;
	protected HeroState jump;
	protected HeroState duck;
	protected HeroState dive;
	protected HeroState shield;
	protected HeroState die;
	
	protected HeroState hs;
	
	public Game(Hero hero) {
		
		this.hero = hero;
		
		stand = new Standing(this);
		die = new Die(this);
		jump = new Jumping(this);
		duck = new Ducking(this);
		dive = new Diving(this);
		shield = new Shielded(this);
		
		hs = stand;
		
	}
	
	public void setState(HeroState hs) {
		this.hs = hs;
	}
	
	
	public void Stand() {
		hs.Stand();
	}
	
	public HeroState getStand() {
		return hs = stand;
	}
	
	public void Duck() {
		hs.Duck();
	}
	
	public HeroState getDuck() {
		return hs = duck;
	}
	public void Dive() {
		hs.Dive();
	}
	
	public HeroState getDive() {
		return hs = dive;
	}
	
	public void shield() {
		hs.Shield();
	}
	
	public HeroState getShield() {
		return hs = shield;
	}
	
	public void Dying() {
		hs.Dying();
	}
	
	public HeroState getDying() {
		return hs = die;
	}
	public void Jump() {
		hs.Jump();
	}
	
	public HeroState getJump() {
		return hs = jump;
	}
	
	
	
}
