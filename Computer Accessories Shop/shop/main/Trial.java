package shop.main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Trial {

	public static void main(String[] args) {
		
		public static ArrayList getAllProducts() throws FileNotFoundException
				
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
	
	}
	
}
