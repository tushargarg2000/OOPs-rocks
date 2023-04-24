package Abstraction;

public interface BankAtm {

    //Normal we had class but here we use keyword interface keyword

    public int checkBalance(int accountNo,String password);

    public void addMoney(int accountNo,int money);

    public void withdrawMoney(int accountNo,int money);

    public double calculateRateOfInterest(int accountNo);
}
