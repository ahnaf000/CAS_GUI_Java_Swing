package shop.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Users {
	//DATA MEMBERS
	private int userId;
	private String username;
	private String surname;
	private int houseNumber;
	private String postcode;
	private String city;
	private String address;
	private boolean isAdmin;
	private boolean isCustomer;
	
	
	//CONSTRUCTORS
	public Users(int userId, String username, String surname, 
				int housenum, String postcode, 
				String city)
	{
		this.setuserId(userId);
		this.setUserName(username);
		this.setSurname(surname);
		this.setHouseNumber(housenum);
		this.setPostcode(postcode);
		this.setCity(city);
		this.setAddress(housenum, postcode, city);
	}
	//METHODS
	
	public String toString()
	{
		return "This is a User object.\n" +
				"User ID: "+this.getUserId() + "\n"+
				"UserName: "+this.getUsername() + "\n"+
				"SurName: "+this.getSurname() + "\n"+
				"Address: "+this.getAddress()+"\n";
				
	}
	
	public static ArrayList getAllUsernames() throws FileNotFoundException
	{
		//instantiating Arraylist of type Users
		ArrayList <String> userNameList = new ArrayList<String>();

		
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
			String usrname = scanToken.next().trim().toUpperCase();
			
			
			//adding items to userNamesList
			userNameList.add(usrname);
			
			scanToken.close();
			continue;
			
		}
		scanLines.close();
		for(String name: userNameList)
		{
			System.out.println(name);
		}
		
		return userNameList;
	}
	
	//getters
	public int getUserId()
	{
		return this.userId;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public String  getSurname()
	{
		return this.surname;
	}
	
	public int getHouseNumber()
	{
		return this.houseNumber;
	}
	
	public String getPostcode() 
	{
		return this.postcode;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public boolean getIsAdmin()
	{
		return this.isAdmin;
	}
	
	public boolean getIsCustomer()
	{
		return this.isCustomer;
	}
	//setters
	public void setuserId(int id)
	{
		this.userId = id;
	}
	
	public void setUserName(String name)
	{
		this.username = name;
	}
	
	public void setSurname(String name)
	{
		this.surname = name;
	}
	
	public void setHouseNumber(int number)
	{
		if (number>0)
		{
			this.houseNumber = number;
		}
		else
		{
			this.houseNumber = -1;
		}
	}
	
	public void setPostcode(String postcode)
	{
		this.postcode = postcode.toUpperCase();
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setAddress(int houseNumber, String postcode, String city)
	{
		this.address = 
				this.getHouseNumber()+"--"+
						this.getPostcode()+"--"+
						this.getCity();
						
	}
	
	public void setIsAdmin(boolean val)
	{
		this.isAdmin = val;
	}
	
	public void setIsCustomer(boolean val)
	{
		this.isCustomer = val;
	}
}
