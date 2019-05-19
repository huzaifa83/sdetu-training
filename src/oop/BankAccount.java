package oop;

public class BankAccount implements IRate {
	// Define variables 
	String accountNumber;
	
	//static: belongs to the CLASS not the object instance
	// Whenever you instantiate an object and when you use the property uniquely to the object we 
	//DON"T use static 
	// IF WE want to use something directly related to the class and NOT the object then we will use STATIC
	
	
	// final: Constant (often static final go together)
	private static final String rountingNumber  = "013546";
	
	// Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	//Constructor definitions: unique methods
		//1. They are used to setup/ define / initialize properties of an object 
		//2/ Constructors are implicitly called upon instantiation
		//3. Same name as the class itself
		//4. They have no return type
	
	BankAccount() {
		System.out.println("New account created");
	}
	
	//Overloading: Calling same method name with different arguments
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);
	}	
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.print("New Account: " + accountType);
		System.out.println(", new initial Deposit of $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be atleast $1000";
		} else {
			Msg = "Thanks for your initial deposit of $ " + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Getters / Setters
	
	//Setter:
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. "+ name;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	// Getter:
	public String getName() {
		return name;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	// Access Specifiers/Modifiers
	//1) Public: This means that the variable or method or class is available anywhere in the Project
	//2) Default: This means that the variable or method or class is available anywhere in the Package
	//3) Private: This means that the variable or method or class is available anywhere in the Class
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount){
		balance = balance + amount;
		showActivity("Withdraw");
	}
	// Private: Can only be called within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction " + activity);
		System.out.println("Your new balance is $" + balance);
	}
	
	void checkBalance(){
		System.out.println("Balance: " + balance);
	}
	
	void getStatus(){
		
	}
	@Override
	public String toString() {
		return "[ NAME:" + name + ". ACCOUNT#" + accountNumber  + ". ROUTING#" + rountingNumber + ". Balance: $" + balance + " ]";
	}
	
}
