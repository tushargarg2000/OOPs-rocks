package Abstraction;

public abstract class BankAbstract {

    abstract void checkBalance(String password,int accountNo);

    abstract String getInformation(int account);

    double getRBIrateOfInterest(){
        return 5.6;
    }





}
