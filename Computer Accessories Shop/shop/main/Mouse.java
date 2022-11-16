package shop.main;

import java.util.ArrayList;

public class Mouse extends Product {
	//DATTA MEMBERS
	private int numberOfButtons;
	private String typeOfMouse ;
	public boolean isStandard;
	public boolean isGaming;
	private final String DEVICE_NAME = "mouse";
	
	//CONSTRUCTORS
	public Mouse(int barcode, String brand, String colour, 
					String connectivity, int quantity,
					float ogCost, float retailPrice,
					int numOfBtns, String type) {
		
		super(barcode, brand, colour, connectivity, quantity, ogCost, retailPrice);
		this.setNumberOfButtons(numOfBtns);
		this.setTypeOfMouse(type);
		
	}
	
	//METHODS
	
	public String toString()
	{
		return "This is a "+this.typeOfMouse +" "+ this.DEVICE_NAME +
				" with "+this.numberOfButtons+" buttons. \n"+
				"Barcode: "+this.getBarcode()+
				"\nBrand: "+this.getBarcode()+
				"\nColour: "+this.getColour()+
				"\nConnectivity: "+this.getConnectivity()+
				"\nQuantity in stock: "+this.getQuantity()+
				"\nOriginal Cost: "+this.getOriginalCost()+
				"\nRetail Price: "+this.getRetailPrice();
							
	}
	
	
	public Arraylist<Mouse> getAllMouse()
	{
		ArrayList<Product> allProducts = super.getAllProducts();
		
		for (Product p : allProducts)
		{
			if (p.i)
		}
	}
	//getters
	public int getNumberOfButtons() {
		return this.numberOfButtons;
	}
	
	public String getTypeOfMouse() {
		return this.typeOfMouse;
	}
	
	@Override
	public String getDeviceName() {
		return this.DEVICE_NAME;
	}
	
	//setters
	public void setNumberOfButtons(int number) {
		if (number>1) {
			this.numberOfButtons = number;
		}
	}
	
	public void setTypeOfMouse(String type) {
		
		/*if the input is neither gaming nor standard
		 * the typeOfMouse is set as null
		 */
		
		if (type.trim().toLowerCase().equals("standard")) {
			this.typeOfMouse = "standard";
			this.isStandard = true;
			this.isGaming = false;
		}
		else if (type.trim().toLowerCase().equals("gaming")) {
			this.typeOfMouse = "gaming";
			this.isGaming = true;
			this.isStandard = false;
		}
	}
	
	
	
}
