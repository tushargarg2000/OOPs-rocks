package Encapsulation2;

import Encapsulation.*;

class Doctor extends Person { //Doctor is the child class hence its able to acces s

    void checkAccess(){

        super.name ="Tushar";
    }
}

class Bank extends Person{ //not the child class : not able to access
    void checkAccess(){
        Person p = new Person();

        super.name = "tuhsar"; //Not allowed bcz Banks is not a child class
        //protected says if outside the package only the child classes can
        //can access.
    }
}