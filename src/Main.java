import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person p1 = new Person("Nitesh",23,"Bankok",10);

        Person p2 = new Person("Sumit",20,"swarg",4);

        System.out.println(p2.age+" "+p2.noOfFriends+"");

        p1.dance(p1.name);
        p2.dance(p2.name);

        BankAccount bankAccount = new BankAccount("12345",200000,"Manmeet");

        bankAccount.withdrawMoney(150000);

        bankAccount.addBonus(50000);

        BankAccount bankAccount1 = new BankAccount("4567",200000,"Saadain");

        bankAccount1.withdrawMoney(50000);
        bankAccount1.addBonus(500000);



    }


}

class BankAccount{

    String acNo;
    int balance;
    String ownerName;

    BankAccount(String acNo,int balance,String ownerName){
        this.acNo = acNo;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    int withdrawMoney(int money){
        balance = balance - money;
        System.out.println("The new balance after withdrawing "+money+" is "+balance);
        return balance;

    }

    int addBonus(int money){
        balance = balance + money;
        System.out.println("The new balance after adding "+money+" is "+balance);
        return  balance;
    }



}


class Person{
    String name;
    int age;
    String dreamPlaceToVisit;
    int noOfFriends;
    Person(String name,int age,String dreamPlaceToVisit,int noOfFriends){
        this.name = name;
        this.age = age;
        this.dreamPlaceToVisit = dreamPlaceToVisit;
        this.noOfFriends = noOfFriends;
    }

    void danceForMins(int time,String name){
        dance(name);
    }

    void dance(String name){
        System.out.println(name+"is dancing very nicely");
        //Normal function that we have
    }

}
