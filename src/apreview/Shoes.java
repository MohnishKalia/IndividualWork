package apreview;

public class Shoes implements ClothingItem {
	private String desc;
	private double price;

	public Shoes() {
		desc = "mocassins";
		price = 12.50;
	}

	public Shoes(String xDesc, double xPrice) {
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
