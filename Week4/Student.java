package programminglaboratory1_week4;

public class Student {
    
    public String studentID;
    public String name;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("ID: " + studentID + ", Name: " + name);
    }

    @Override
    public String toString() {
        return "Student[ID=" + studentID + ", Name=" + name + "]";
    }
}