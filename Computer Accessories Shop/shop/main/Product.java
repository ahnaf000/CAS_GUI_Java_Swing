package shop.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Product {
	//DATA MEMBERS
	private int barcode;
	private String brand;
	private String colour;
	private String connectivity;
	private int quantity;
	private float originalCost;
	private float retailPrice;
	
	
	//CONSTRUCTORS
	public Product(int barcode, String Brand, String colour, String Connectivity,
					int quantity, float OgCost, float retailPrice) {
		
		this.setBarcode(barcode);
		this.setBrand(Brand);
		this.setColour(colour);
		this.setConnectivity(Connectivity);
		this.setQuantity(quantity);
		this.setOriginalCost(OgCost);
		this.setRetailPrice(retailPrice);
	}
	
	//MEHTODS
	public static ArrayList<Product> getAllProducts() throws FileNotFoundException
	
			/*reads the StockData.txt file and
			 * returns appropriate objects of 
			 * product items (MOUSE OR KEYBOARD)
			 */
	{
		ArrayList <Product> allProducts = new ArrayList <Product>();
		
		File StockDataFile = new File("StockData.txt");
		Scanner scanLines = new Scanner(StockDataFile);
		
		while (scanLines.hasNextLine())
		{
			String line = scanLines.nextLine();
			
			Scanner scanToken = new Scanner(line);
			scanToken.useDelimiter(",");
			
			int barcode = Integer.parseInt(scanToken.next().trim());
			
			String deviceName = scanToken.next().trim().toLowerCase();
			
			if (deviceName.equals("mouse"))
			{
				
				String deviceTypeM = scanToken.next().trim().toLowerCase();
				
				String brandM = scanToken.next().trim().toLowerCase();
				
				String colourM = scanToken.next().trim().toLowerCase();
				
				String connectivityM = scanToken.next().trim().toLowerCase();
			
				int quantityM = Integer.parseInt(scanToken.next().trim());
				
				float originalCostM = Float.parseFloat(scanToken.next().trim());
				
				
				float retailPriceM = Float.parseFloat(scanToken.next().trim());
				
				int xtraInformationM = Integer.parseInt(scanToken.next().trim());
				
				Mouse m = new Mouse(barcode, brandM, colourM, connectivityM,
									quantityM, originalCostM, retailPriceM,
									xtraInformationM, deviceTypeM);
				allProducts.add(m);
				scanToken.close();
			}
			else if (deviceName.equals("keyboard"))
			{		
				
				String deviceTypeK = scanToken.next().trim().toLowerCase();
				
				String brandK = scanToken.next().trim().toLowerCase();
				
				String colourK = scanToken.next().trim().toLowerCase();
				
				String connectivityK = scanToken.next().trim().toLowerCase();
			
				int quantityK = Integer.parseInt(scanToken.next().trim());
				
				float originalCostK = Float.parseFloat(scanToken.next().trim());
				
				float retailPriceK = Float.parseFloat(scanToken.next().trim());
				
				String xtraInformationK = scanToken.next().trim().toLowerCase();
				
				Keyboard k = new Keyboard(barcode, brandK, colourK, connectivityK,
										quantityK, originalCostK, retailPriceK, 
										xtraInformationK,deviceTypeK );	
				allProducts.add(k);
				scanToken.close();
					
			}
		}//end of while loop
		scanLines.close();
		
		for(Product p: allProducts)
		{
			System.out.println(p.toString());
			System.out.println("");
		}
		return allProducts ;
	}
	
	//getters
	public int getBarcode() {
		return this.barcode;
	}
 
	public String getBrand() {
		return this.brand;
	}
	 
	public String getColour() {
		return this.colour;
	}
	
	public String getConnectivity() {
		return this.connectivity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public float getOriginalCost() {
		return this.originalCost;
	}
	
	public float getRetailPrice() {
		return this.retailPrice;
	}
	
	public abstract String getDeviceName() ;
	
	//setters
	//TYPE CHECK NOT YET IMPLEMENTED
	public void setBarcode(int Barcode) {
		/*
		 * If data of incorrect size is entered, the return value is 0
		 */
		String strBarcode = String.valueOf(Barcode).trim();
		
		if (strBarcode.length() == 6) {
			int intBarcode = Integer.valueOf(strBarcode);
			this.barcode = intBarcode;
		}
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColour(String color) {
		this.colour = color;	
	}
	
	public void setConnectivity(String connectivity) {
		/*
		 * If the value of connectivity is not 'wired' or
		 * 'wireless' ,then the default value set is set to "null". 
		 */
		String val = connectivity.trim().toLowerCase();
		if ( val.equals("wired")  ) {
			this.connectivity = "wired";
		}
		else if( val.equals("wireless")) {		
			this.connectivity = "wireless";
		}
		else {
			this.connectivity= null;
		}
	}
	
	
	
	public void setQuantity(int amount) {
		//has to be greater than 0
		//work in progress
		this.quantity = amount;
	}
	
	public void setOriginalCost(float amount) {
		/*
		 * if amount entered in less than or equals to 0,
		 * the OriginalCost is set to be 0
		 */
		if (amount >0) {
			this.originalCost = amount;
		}
	}
	
	public void setRetailPrice(float amount) {
		/*the amount entered has to be more than the original cost
		 * of the object.
		 * this method cannot be called unless the OriginalCost of the object is set.
		 * 
		 * if the RetialPrice is less than the original Cost,
		 * the value of RetailPrice is set to 0
		 */
		
		if (amount>this.originalCost ) {
			this.retailPrice = amount;
		}
	}
	
	
	
	/*public static void main(String[] args) {
		Product item = new Product(903456,"ASUS","Blue","WIreless",2,1000,100);
		System.out.println(item.getBarcode());
		System.out.println(item.getBrand());
		System.out.println(item.getColour());
		System.out.println(item.getConnectivity());
		System.out.println(item.getQuantity());
		System.out.println(item.getOriginalCost());
		System.out.println(item.getRetailPrice());
	
		
	}
	*/	
	
	
}

