package apreview;

import java.util.ArrayList;

public class Train {
	private Engine engine;
	private ArrayList<TrainCar> trainCars;

	public Train(Engine e, ArrayList<TrainCar> tc) {
		engine = e;
		trainCars = tc;
	}

	/**
	 * Removes TrainCar objects from the end of the train until the train can be
	 * pulled by the Engine.
	 *
	 * @return ArrayList<TrainCar> containing the removed cars in the order they
	 *         were removed (the last car is· item O, etc.). If no cars are removed,
	 *         the returned list will be empty.
	 */
	public ArrayList<TrainCar> removeExcessTrainCars() {
		ArrayList<TrainCar> excess = new ArrayList<TrainCar>();
		double trWeight;
		do {
			trWeight = 0;
			for (TrainCar temp : trainCars) {
				trWeight += temp.getBaseWeight();
			}
			if (engine.getMaximumWeight() > trWeight) {
				excess.add(trainCars.remove(trainCars.size() - 1));
			}
		} while (engine.getMaximumWeight() > trWeight);
		return excess;
	}
}
