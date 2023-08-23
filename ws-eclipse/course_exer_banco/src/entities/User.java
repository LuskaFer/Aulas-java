package entities;

public class User {
	private int number;
	private String name;
	private double balance;

	public User(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public User(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
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
	
	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		this.balance -= value + 5.00;
	}
	
	public String toString() {
		return "Account "
			+ number
			+ ", Holder:"
			+ name
			+ ", Balance: $ "
			+ String.format("%.2f ", balance);
	}
	
}
