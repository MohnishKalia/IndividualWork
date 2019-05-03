package inheritance;

public class Player {
	private int health;
	private int locx;
	private int locy;

	public Player() {
		health = 100;
		locx = 0;
		locy = 0;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLocx() {
		return locx;
	}

	public void setLocx(int locx) {
		this.locx = locx;
	}

	public int getLocy() {
		return locy;
	}

	public void setLocy(int locy) {
		this.locy = locy;
	}

	public void move() {
		locx++;
		locy++;
	}

	public boolean dead() {
		return health <= 0;
	}

	public String stats() {
		return "Player: Health = " + health + ", LocX = " + locx + ", LocY = " + locy;
	}
}
