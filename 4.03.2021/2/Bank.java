package pl.Skalinski;

abstract class Bank {
    abstract String getBalance();

    public void AcountState(int Banknr){
        System.out.println(Banknr + " Bank New Balance: " + getBalance());
    }
}
