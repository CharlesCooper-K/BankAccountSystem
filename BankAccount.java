
public class BankAccount {
	private String accountNum;
	private String name;
	private double balance;
	
	public BankAccount() {
		setAccountNum("");
		setName("");
		setBalance(0.0);
	}
	
	public BankAccount(String accountNum, String name, double balance) {
		setAccountNum(accountNum);
		setName(name);
		setBalance(balance);
	}
	
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double checkBalance() {
		if (balance < 0) {
			System.out.println("Your account is overdrafted. Please deposit money soon.");
		}
		
		return getBalance();
	}
	
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount must be greater than 0.");
		} else {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be greater than 0.");
		} else if (amount > balance) {
			System.out.println("Insufficient funds.");
		} else {
			balance -= amount;
		}
	}
}
