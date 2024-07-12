class BankAccount {
	private double bal;
	private String pswrd;

	public BankAccount(String pswrd, double bal) {
		this.pswrd = pswrd;
		this.bal = bal;
	}

	private class Interest {
		double rate = 0.05;

		public void Cal_Interest() {
			double balance = rate * bal;
			bal += balance;
	System.out.println(" The balance is = "+bal );
		}
	}

	public void Auth(String password) {
		if (password.equals("ram")) {
			Interest I = new Interest();
			I.Cal_Interest();
		} else {
			System.out.println("wrong paskey");
		}
	}

	public double getbal() {
		return bal;
	}
}

public class Main {
	public static void main(String args[]) {
		String password = "ram";
		double balance = 100000;

	BankAccount bank = new BankAccount(password, balance);
		bank.Auth(password);
		bank.Auth("ashgas");
	}
}
