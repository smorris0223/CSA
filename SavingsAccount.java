public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(int id, double balance, double i){
        super(id, balance);
        interestRate = i;
    }

    @Override
    public double monthlyInterest() {
        return currentBalance()*(interestRate/12);
    }

    public void withdraw(double n){
        if(n<=currentBalance()){
            decreaseBalance(n);
    }
    else{System.err.println("overdraft");}
}
}