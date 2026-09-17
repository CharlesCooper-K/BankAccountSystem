import java.util.Scanner;

public class BankAccountSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		double depo, with; 
		double balance = 1000.0;
		String name = " ";
		String accountNum = " ";
		BankAccount account = new BankAccount(accountNum, name, balance);
		
		do {
			System.out.print("Welcome to Coop Banking! How can we help you today?\n"
					+ "1. Create Account\n2. Check Balance\n3. Deposit\n4. Withdraw\n5. Exit\nYour Selection: ");
			choice = input.nextInt();
			
				switch (choice) {
				case 1:
					System.out.print("Enter your first name: ");
					name = input.next();
					account.setName(name);
					System.out.print("Create a 8-digit account number: ");
					accountNum = input.next();
					
					if (accountNum.length() < 8) {
						System.out.println("Error account number too short.");
					} else if (accountNum.length() > 8) {
						System.out.println("Error, account number too long.");
					} else if (!accountNum.matches("\\d{8}")) { 
						
					}
						else {
						System.out.printf("Thank you %s, for banking with Coop Banking! Your account number is %s%n", name, accountNum);
						account.setAccountNum(accountNum);
					}
					break;
					
				case 2:
					System.out.print("Enter your account number: ");
					accountNum = input.next();
					if (accountNum.equals(account.getAccountNum())) {
						System.out.printf("%s, your account balance is $%.2f%n", account.getName(), account.getBalance());
					} else {
						System.out.println("Invalid account number.");
					}
					break;
					
				case 3:
					System.out.print("Enter your account number: ");		
					accountNum = input.next();
					System.out.print("Enter deposit amount: $");
					depo = input.nextDouble();
					account.deposit(depo);
					System.out.printf("%s, your new balance is $%.2f%n", account.getName(), account.getBalance());
					break;
					
				case 4:
					System.out.print("Enter your account number: ");		
					accountNum = input.next();
					System.out.print("Enter withdrawal amount: ");
					with = input.nextDouble();
					account.withdraw(with);
					System.out.printf("%s, your new balance is $%.2f%n", account.getName(), account.getBalance());
					break;
					
				case 5:
					break;
					
					default:
						System.out.println("Invalid choice, please enter any value 1-5.");
						break;
					} 					
		} while (choice != 5); 
		System.out.println("Thank you for coming to Coop Banking!");
	}
}
