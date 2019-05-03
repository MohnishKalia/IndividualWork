package inheritance;

public class Rogue extends Player {
	private int kills;

	public Rogue() {
		kills = 0;
	}

	public void move() {
		super.setLocx(super.getLocx() + (int) Math.ceil(Math.random() * 50));
		super.setLocy(super.getLocy() + (int) Math.ceil(Math.random() * 50));
		if (Math.random() < 0.25)
			super.setHealth(super.getHealth() - 10);
		if (Math.random() < 0.2)
			kills++;
	}

	public String stats() {
		return "Rogue: Kills = " + kills + super.stats();
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}
}
