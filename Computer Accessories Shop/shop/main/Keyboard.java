package shop.main;

public class Keyboard extends Product{
	
	//DATA MEMBERS
	private String layout ;
	private String typeOfKeyboard;
	private boolean isStandard;
	private boolean isInternet;
	private boolean isGaming;
	private boolean isFlexible;
	private String deviceName = "keyboard";
	
	
	//CONSTRUCTORS
	public Keyboard(int barcode, String Brand, String colour, String Connectivity, int quantity, float OgCost,
			float retailPrice, String layout, String type) 
	{
		
		super(barcode, Brand, colour, Connectivity, quantity, OgCost, retailPrice);
		this.setLayout(layout);
		this.setTypeOfKeyboard(type);
	}
	
	//METHODS
	public String toString()
	{
		return "This is a "+this.typeOfKeyboard +" "+ this.deviceName +
				" with a "+this.getLayout()+" layout. \n"+
				"Barcode: "+this.getBarcode()+
				"\nBrand: "+this.getBarcode()+
				"\nColour: "+this.getColour()+
				"\nConnectivity: "+this.getConnectivity()+
				"\nQuantity in stock: "+this.getQuantity()+
				"\nOriginal Cost: "+this.getOriginalCost()+
				"\nRetail Price: "+this.getRetailPrice();
				
				
	}
	//getters
	public String getLayout()
	{
		return this.layout;
	}
	
	public String getTypeOfKeyboard()
	{
		return this.typeOfKeyboard;
	}
	
	public boolean getIsStandard()
	{
		return this.isStandard;
	}
	
	public boolean getIsGaming()
	{
		return this.isGaming;
	}
	
	public boolean getIsInternet()
	{
		return this.isInternet;
	}
	
	public boolean getIsFlexible()
	{
		return this.isFlexible;
	}
	
	@Override
	public String getDeviceName ()
	{
		return this.deviceName;
	}
	
	
	//setters
	public void setLayout(String layout)
	{
		
			if (layout.trim().toLowerCase().equals("us"))
			{
				this.layout = "us";
			}
			else if (layout.trim().toLowerCase().equals("uk"))
			{
				this.layout = "uk";
			}
		
		
	}
	
	public void setTypeOfKeyboard(String type)
	{
		if (type.trim().toLowerCase().equals("standard"))
		{
			this.typeOfKeyboard = "standard";
			this.isStandard = true;
			
			this.isFlexible  = false;
			this.isGaming = false;
			this.isInternet = false;		
		}
		else if (type.trim().toLowerCase().equals("flexible"))
		{
			this.typeOfKeyboard = "flexible";
			this.isFlexible  = true;
			
			this.isStandard = false;
			this.isGaming = false;
			this.isInternet = false;
		}
		else if (type.trim().toLowerCase().equals("gaming"))
		{
			this.typeOfKeyboard = "gaming";
			this.isGaming = true;
			
			this.isFlexible  = false;
			this.isStandard = false;
			this.isInternet = false;
		}
		else if (type.trim().toLowerCase().equals("internet"))
		{
			this.typeOfKeyboard = "internet";
			this.isInternet = true;
			
			this.isFlexible  = false;
			this.isStandard = false;
			this.isGaming = false;
		}
	}

}
