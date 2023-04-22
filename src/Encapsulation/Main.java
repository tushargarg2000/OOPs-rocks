package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("123",1000000);

        employee.changePassword("123","Keepsmiling");



    }
}

class Admin{

    void changePassword(){
        Employee employee = new Employee("123",123);
        String password = employee.getPassword();
    }
}

class Employee{

    public String name;
    public int age;

    private int salary;

    private String password;

    Employee(String password,int salary){
        this.password = password;
        this.salary = salary;
    }


    public String changePassword(String oldPassword,String newPassword){

        if(oldPassword==password){
            password = newPassword;
            return "Password changed successfully";
        }else{
            return "Old password is incorrect";
        }
    }

    public String getPassword(){
        return password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary,String password) {


            this.salary = salary;


    }

    public void setPassword(String password) {
        this.password = password;
    }
}
