package Abstraction;

public class Lotak implements BankAtm{

    int accountNo;
    int balance;
    String password;

    static double rateOfInterest = 7.5;

    public int checkBalance(int accountNo, String password) {
        if(accountNo==this.accountNo){
            if(password.equals(this.password)){
                return balance;
            }
        }

        return 0;
    }

    public void addMoney(int accountNo, int money) {

    }

    public void withdrawMoney(int accountNo, int money) {

    }

    public double calculateRateOfInterest(int accountNo) {

        return rateOfInterest;
    }
}
