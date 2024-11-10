import java.util.ArrayList;
import java.util.List;

public class EngClass {
    private List<Student> students;

    public EngClass() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " added.");
    }

    public void deleteStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " removed.");
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the class.");
        } else {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
