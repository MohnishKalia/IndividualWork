package apreview;

public class Top implements ClothingItem {
	private String desc;
	private double price;

	public Top() {
		desc = "sweatshirt";
		price = 17.85;
	}
	public Top(String xDesc, double xPrice) {
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
