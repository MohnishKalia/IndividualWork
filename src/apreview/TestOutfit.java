package apreview;

public class TestOutfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClothingItem outfit = new Outfit(new Shoes(), new Pants(), new Top());
		System.out.println(outfit.getDescription());
		System.out.println(outfit.getPrice());
	}

}
