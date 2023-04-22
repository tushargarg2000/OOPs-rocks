package Inheritance;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Strange",40,123,"doc",12,"eye");


        Person person = new Person("Abhishek",22);

        Person person1 = new Person("tushar",22,1234,"tushar");

//        doctor.dance();
//
        Student student = new Student();

        System.out.println(student.age+" -- "+student.name);

        doctor.add(2,3);
        doctor.add(3,4,5);
        doctor.add(1,2,3,4);


        Person p = new Doctor("tushar",22,2);


    }
}

class Student{
    String name; //Default value null
    int age; //Default value : 0

    Student(){
        name = "Mohammad";
        age = 3;
    }
}


class Person{
    String name;
    int age;
    int mobNo;
    String email;

    String country;

    String hobby;

    String instaFollowers;




    public Person(String name, int age, int mobNo, String email, String country, String hobby, String instaFollowers) {
        this(name,age,mobNo,email,country);
        this.hobby = hobby;
        this.instaFollowers = instaFollowers;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    public Person(String name, int age, int mobNo, String email, String country) {
        this(name,age);
        this.mobNo = mobNo;
        this.email = email;
        this.country = country;
    }

    public Person(String name, int age, int mobNo, String email) {
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.email = email;
    }

    void dance(){
        System.out.println("Person is dancing");
    }

}
class Doctor extends Person{

    int yearsOfExp;
    String specialization;

    String email;

    String func(){


        String value = super.email;

       String ans =  this.email;
        return ans;
    }

    String func1(){
        String ans=  this.email;

        return ans;
    }



    Doctor(String name,int age,int yearsOfExp){
        super(name,age);
        this.yearsOfExp = yearsOfExp;
    }

    Doctor(String name, int age, int mobNo, String email,int yearsOfExp,String specialization){
        super(name,age,mobNo,email);
        this.yearsOfExp = yearsOfExp;
        this.specialization = specialization;

    }

    String getEmailAddress(){
        return super.email;
    }

    void doDance(String type){



//        if(type=="parent"){ //Inorder to refer to the parent dance function
//            //dance();//This will refer to the local dance
//            //To parent dance
//            super.dance();
//        }else{
//            //type child
//            this.dance();
//        }
    }

    void dance(){

    }

    int sourabh(int money){
        return 0;
    }
    int sourabh(String money){
        return 0;
    }

    void dance(int time,int danceFees){

    }

    void dance(int time,String danceStyle){

    }

    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }


}
