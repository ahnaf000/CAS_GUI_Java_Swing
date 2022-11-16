package shop.main;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InteractionsWithUserAccountsTextFile 
{			
	public static void main(String[] args) throws FileNotFoundException 
	{
		Product.getAllProducts();
		
		
		
		
		
		
			
			
		



		/*
		//instantiating Arraylist of type Users
		ArrayList <Admin> usersList = new ArrayList<Admin>();
		
		File userAccountsFile = new File("UserAccounts.txt");
		Scanner scanLines = new Scanner(userAccountsFile);
		
		while (scanLines.hasNextLine())
		{
			String line = scanLines.nextLine();
			
			Scanner scanToken = new Scanner(line);
			scanToken.useDelimiter(",");
			
			//userId
			int userId = Integer.parseInt(scanToken.next().trim());
			//username
			String usrname = scanToken.next().trim().toLowerCase();
			//surname
			String surname = scanToken.next().trim().toLowerCase();
			//houseNumber
			int housenum = Integer.parseInt(scanToken.next().trim());
			//String houseNum = String.valueOf(housenumInt);
			//postcode
			String postcode = scanToken.next().trim().toUpperCase();
			//city
			String city = scanToken.next().trim().toLowerCase();
			//type of user (customer/admin)
			String typeOfUser = scanToken.next().trim().toLowerCase();
			
			scanToken.close();
			
			Admin u = new Admin(userId, usrname, surname, housenum, postcode, city);
			usersList.add(u);
		}
		scanLines.close();
	

		for(Admin u: usersList)
		{	
			
				System.out.println(u.toString());
			
		}
		*/
		
	}
	
	//my function
	
	
}
