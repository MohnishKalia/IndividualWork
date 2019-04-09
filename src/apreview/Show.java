package apreview;

public class Show {
	/** The seats for this show */
	private int[][] seats;
	private final int SEATS_PER_ROW = 6;
	private final int NUM_ROWS = 3;

	/**
	 * Returns true if the seat with the specified row and seat number is an aisle
	 * seat, false otherwise. @param row the row number @param seatNumber the seat
	 * number @return true if an aisle seat, false otherwise
	 */
	public boolean isAisleSeat(int row, int seatNumber) { /* to be implemented in part (a) */
		return seatNumber == 0 || seatNumber == SEATS_PER_ROW - 1;
	}

	/**
	 * Reserve two adjacent seats and return true if this was successfully done. If
	 * two adjacent seats could not be found, leave the state of the show unchanged,
	 * and return false. @return true if two adjacent seats were found, false
	 * otherwise
	 */
	public boolean twoTogether() { /* to be implemented in part (b) */
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[0].length - 1; j++) {
				if (seats[i][j] == 0 && seats[i][j + 1] == 0) {
					seats[i][j] = 1;
					seats[i][j + 1] = 1;
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Return the lowest seat number in the specified row for a block of empty
	 * adjacent seats. If no such block exists, return -1.
	 * 
	 * @param row         the row number
	 * @param seatsNeeded the number of adjacent empty seats needed
	 * @return lowest seat number for a block of needed adjacent seats or -1 if no
	 *         such block exists
	 */
	public int findAdjacent(int row, int seatsNeeded) {
		/* to be implemented in part (c) */
		int count = 0;
		for (int i = 0; i < seats[row].length; i++) {
			count = (seats[row][i] == 0) ? count++ : 0;
			if (count == seatsNeeded)
				return i - seatsNeeded;
		}
		return -1;
	}
//There may be instance variables, constructors, and methods
//that are not shown.
}
