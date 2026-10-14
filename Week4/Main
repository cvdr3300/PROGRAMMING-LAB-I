package programminglaboratory1_week4;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammingLaboratory1_Week4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        // 3. Course Setup
        System.out.print("How many courses to create (at least 3): ");
        int courseCount = in.nextInt();
        in.nextLine(); // Buffer temizleme

        for (int i = 0; i < courseCount; i++) {
            System.out.println("\n--- Creating Course " + (i + 1) + " ---");
            System.out.print("Enter course name: ");
            String name = in.nextLine().trim();

            System.out.print("Enter classroom capacity: ");
            int cap = in.nextInt();
            in.nextLine(); // Buffer temizleme

            courses.add(new Course(name, cap));
        }

        // Mevcut kursları listele
        System.out.println("\n--- Available Courses ---");
        for (Course c : courses) {
            System.out.println("- " + c.courseName + " (Capacity: " + c.capacity + ")");
        }

        // 4. Register Students
        System.out.println("\n--- Student Registration ---");
        System.out.print("Enter student ID: ");
        String sId = in.nextLine().trim();

        System.out.print("Enter student name: ");
        String sName = in.nextLine().trim();

        System.out.print("Enter course name to register: ");
        String targetCourseName = in.nextLine().trim();

        // Kursu ara
        Course selectedCourse = null;
        for (Course c : courses) {
            if (c.courseName.equalsIgnoreCase(targetCourseName)) {
                selectedCourse = c;
                break;
            }
        }

        if (selectedCourse == null) {
            System.out.println("No course found with that name.");
        } else if (selectedCourse.enrolledStudents.size() >= selectedCourse.capacity) {
            System.out.println("This course is full. Registration failed.");
        } else {
            // Öğrenci zaten kayıtlı mı kontrolü (studentID bazlı)
            boolean alreadyEnrolled = false;
            for (Student s : selectedCourse.enrolledStudents) {
                if (s.studentID.equalsIgnoreCase(sId)) {
                    alreadyEnrolled = true;
                    break;
                }
            }

            if (alreadyEnrolled) {
                System.out.println("This student is already registered for this course.");
            } else {
                Student newStudent = new Student(sId, sName);
                selectedCourse.enrolledStudents.add(newStudent);
                System.out.println("Registration successful.");
            }
        }

        // 5. View All Courses
        System.out.println("\n================ All Courses ================");
        for (Course c : courses) {
            c.displayCourse();
        }
    }
}
