class Student {

    String name; // default value is null
    int rollNo; // default value is 0

    Student(String name, int rollNo) {
        this.name = "Anil";
        this.rollNo = 34234;
    }
}

public class Lecture1 {

    public static void main(String args[]) {

        Student anil = new Student("anil", 23);
        Student ayush = anil;  // just a reference to the anil Object
        ayush.name = "This is ayush";
        System.out.println("ayush : " + ayush.name);
        System.out.println("anil : " + anil.name);
    }
}
