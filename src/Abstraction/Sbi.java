package Abstraction;

public class Sbi implements BankAtm{

    int balance;
    int accountNo;
    String password;

    static double rateOfInterest = 6.0;

    public int checkBalance(int accountNo, String password) {

        if(accountNo==this.accountNo){
            if(password.equals(this.password)){
                return balance;
            }
        }

        return -1;
    }

    public void addMoney(int accountNo, int money) {

    }

    public void withdrawMoney(int accountNo, int money) {

    }

    public double calculateRateOfInterest(int accountNo) {

        if(accountNo==this.accountNo){
            return rateOfInterest;
        }
        return 0;
    }
}
