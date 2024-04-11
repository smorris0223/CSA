public class SpecialCheckingAccount extends CheckingAccount{
    private double minimumbalance;
    private double interestRate;
    public SpecialCheckingAccount(int idNumber, double startBal, double cc,double i, double m){
        super(idNumber, startBal, cc);
        minimumbalance = m;
        interestRate = i;

    }
    public void clearCheck(double amount){
        if(currentBalance()>=minimumbalance){
            decreaseBalance(amount);
        }
        else{super.clearCheck(amount);}
    
    }
    @Override
    public double monthlyInterest() {
        if(currentBalance()>minimumbalance){
            return (currentBalance()*(interestRate/12));
        }
        else{return super.monthlyInterest();}
    }
}
