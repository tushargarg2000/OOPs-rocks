package StaticKnowledge;

public class Main {

    public static void main(String[] args) {

        Student.schoolName = "DAV"; //I didn't need the object
        //to set this attribute independent of the object

        Student.getSchoolName(); //if any variable is private
        //we need to access them using getters and setters
        nonStaticMethod();
    }
    public static void nonStaticMethod(){

        String ans = Student.getSchoolName();
//        Should Not work : check
//        Student studentObj = new Student();
//        studentObj.getSchoolName();

        Student s1 = new Student(1234);

        //s1.bankAccountNo = 456;

    }


}

class Student{

    private String name;
    private int age;

    public final int bankAccountNo;

    public static String schoolName;

    Student(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public static String getSchoolName(){
        return schoolName;
    }
}
