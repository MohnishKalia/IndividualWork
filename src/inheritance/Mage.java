package inheritance;
public class Mage extends Player {
	private int spells;

	public Mage() {
		spells = 10;
	}

	public void move() {
		super.setLocx(super.getLocx() + (int) Math.ceil(Math.random() * 10));
		super.setLocy(super.getLocy() + (int) Math.ceil(Math.random() * 10));
		if (Math.random() < 0.1)
			super.setHealth(super.getHealth() - 10);
		if (Math.random() < 0.125)
			spells++;
	}

	public String stats() {
		return "Mage: Spells = " + spells + super.stats();
	}

	public int getSpells() {
		return spells;
	}

	public void setSpells(int spells) {
		this.spells = spells;
	}

}
