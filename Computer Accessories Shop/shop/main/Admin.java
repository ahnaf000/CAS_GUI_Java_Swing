package shop.main;

public class Admin extends Users
{
	//DATA MEMBERS
	private String role = "admin";
	
	//CONSTRUCTORS
	public Admin(int userId, String username, String surname, int housenum, 
				String postcode, String city) 
	{
		super(userId, username, surname, housenum, postcode, city);
		this.setIsAdmin(true);
		this.setIsCustomer(false);
		
	}
	
	//METHODS
	@Override 
	public String toString()
	{
		return "This is a User object.\n" +
				"Role: "+this.getRole() + "\n"+
				"User ID: "+this.getUserId() + "\n"+
				"UserName: "+this.getUsername() + "\n"+
				"SurName: "+this.getSurname() + "\n"+
				"Address: "+this.getAddress()+"\n";
		
				
	}
	
	//getters
	public String getRole()
	{
		return this.role;
	}

}
