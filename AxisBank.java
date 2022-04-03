package Banking;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		 
		System.out.println("This is Axis bank Deposit");

	}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.fixed();
		axis.saving();
		axis.deposit();
		
	}

}
