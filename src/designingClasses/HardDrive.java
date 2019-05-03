package designingClasses;

import java.util.ArrayList;
public class HardDrive {

	private String name;
	private ArrayList<Double> fileSpace;
	private double capacity;
	private double freeSpace;

	/**
	 * Constructs a hard drive object with a name and capacity as parameters.
	 * 
	 * @param xName     name given to the hard drive
	 * @param xCapacity total storage capacity in GB
	 */
	public HardDrive(String xName, double xCapacity) {
		fileSpace = new ArrayList<Double>();
		name = xName;
		capacity = xCapacity;
		freeSpace = capacity;
	}

	/**
	 * Used to add a new file to the file system. The file must be able to fit on
	 * the disk, otherwise the full size of the disk is taken up.
	 * 
	 * @param xSize the double value of the file to be added (GB)
	 */
	public void addFile(double xSize) {
		if (freeSpace >= xSize) {
			fileSpace.add(xSize);
			freeSpace -= xSize;
		} else {
			fileSpace.add(freeSpace);
			freeSpace = 0;
		}
	}

	/**
	 * Used to delete a file from the file system. Free space is automatically
	 * calculated.
	 * 
	 * @param index the int index of the file to be deleted
	 */
	public void deleteFile(int index) {
		try {
			freeSpace += fileSpace.remove(index);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Predicate method that returns whether the hard drive is full.
	 * 
	 * @return boolean the result of the logic check
	 */
	public boolean isFull() {
		if (Math.abs(freeSpace) < 1e-14)
			return true;
		return false;
	}

	/**
	 * Predicate method that returns whether the hard drive is empty.
	 * 
	 * @return boolean the result of the logic check
	 */
	public boolean isEmpty() {
		if (Math.abs(capacity - freeSpace) < 1e-14)
			return true;
		return false;
	}
}
