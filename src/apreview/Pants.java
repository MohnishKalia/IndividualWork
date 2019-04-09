package apreview;

public class Pants implements ClothingItem {
	private String desc;
	private double price;

	public Pants() {
		desc = "cutoffs";
		price = 8.75;
	}
	public Pants(String xDesc, double xPrice) {
		desc = xDesc;
		price = xPrice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return desc;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}
