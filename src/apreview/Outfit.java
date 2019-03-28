package apreview;

public class Outfit implements ClothingItem {
	Shoes shoes;
	Pants pants;
	Top top;

	public Outfit(Shoes xShoe, Pants xPant, Top xTop) {
		shoes = xShoe;
		pants = xPant;
		top = xTop;
		// Compiles without error
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return shoes.getDescription() + "/" + pants.getDescription() + "/" + top.getDescription();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		double sp = shoes.getPrice();
		double pp = pants.getPrice();
		double tp = top.getPrice();
		if (sp + pp >= 100 || sp + tp >= 100 || pp + tp >= 100) {
			return 0.75 * (sp + pp + tp);
		}
		return 0.9 * (sp + pp + tp);
	}
}
