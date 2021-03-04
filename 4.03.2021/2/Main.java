package pl.Skalinski;

public class Main {

    public static void main(String[] args) {

		BankA bank1 = new BankA();
		bank1.getBalance();
		bank1.AcountState(1);

		BankB bank2 = new BankB();
		bank2.getBalance();
		bank2.AcountState(2);

		BankC bank3 = new BankC();
		bank3.getBalance();
		bank3.AcountState(3);
    }
}
