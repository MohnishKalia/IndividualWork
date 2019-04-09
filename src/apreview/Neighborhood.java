package apreview;

import java.util.ArrayList;

public class Neighborhood {
	ArrayList<Family> families = new ArrayList<Family>();

	public void add(Family newFamily) {
		families.add(newFamily);
	}

	public boolean isInNeighborhood(Person person) {
		/* to be implemented in part (c) */
		for (Family temp : families) {
			if (temp.isInFamily(person))
				return true;
		}
		return false;
	}
}
