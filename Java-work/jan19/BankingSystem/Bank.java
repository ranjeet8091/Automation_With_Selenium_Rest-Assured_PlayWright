package BankingSystem;

public class Bank {
	private String Name;
	private double balance;
      
	public Bank(String Name) {
		this.Name=Name;
		
	}
	public Bank(String Name,double balance) {
		if(balance==0) {
			this.Name=Name;
		}
		else {
			this.Name=Name;
			this.balance=balance;
		}
	}
	public String getType(){
		if(balance==0) {
			return "Jan Dhan";
		}
		else
		{
			return "Abani's Account";
		}
	}
}
