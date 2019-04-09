package apreview;

public class AlterImage {
	/**
	 * Converts 3 arrays of color values into one array of Pixel objects
	 * 
	 * @param reds   the red color values
	 * @param greens the green color values
	 * @param blues  the blue color values
	 * @return the Pixel array generated with information in the red, green and blue
	 *         arrays Precondition: The three color arrays are all the same size and
	 *         contain int values in the range 0-255. Postcondition: The returned
	 *         array is the same size as the
	 * 
	 *         3 color arrays.
	 */

	public Pixel[][] generatePixelArray(int[][] reds, int[][] greens,
			int[][] blues) { /* to be implemented in part (a) */
		Pixel[][] pic = new Pixel[reds.length][reds[0].length];
		for (int i = 0; i < pic.length; i++) {
			for (int j = 0; j < pic[0].length; j++) {
				pic[i][j] = new Pixel(reds[i][j], greens[i][j], blues[i][j]);
			}
		}
		return pic;
	}

	/**
	 * Flips a 20 array of Pixel objects either horizontally or vertically
	 *
	 * @param image the 20 array of Pixel objects to be processed
	 * @param horiz true: flip horizontally, false: flip vertically
	 * @return the processed image
	 */
	public Pixel[][] flipimage(Pixel[][] image, boolean horiz) { /* to be implemented in part (b) */
		if (horiz) {
			for (int i = 0; i < image.length / 2; i++) {
				for (int j = 0; j < image[0].length; j++) {
					Pixel beg = image[i][j];
					Pixel end = image[image.length - 1 - i][image[0].length - 1 - j];
					image[i][j] = end;
					image[image.length - 1 - i][image[0].length - 1 - j] = beg;
				}
			}
		} else {
			for (int i = 0; i < image.length; i++) {
				for (int j = 0; j < image[0].length / 2; j++) {
					Pixel beg = image[i][j];
					Pixel end = image[image.length - 1 - i][image[0].length - 1 - j];
					image[i][j] = end;
					image[image.length - 1 - i][image[0].length - 1 - j] = beg;
				}
			}
		}
		return image;
	}
}
