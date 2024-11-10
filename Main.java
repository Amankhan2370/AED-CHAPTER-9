public class Main {
    public static void main(String[] args) {
        EngClass engClass = new EngClass();

        Student student1 = new Student(1, "Aman", "Khan");
        Student student2 = new Student(2, "Hasnain", "Ali");
        Student student3 = new Student(3, "Basith", "Ahmed");

        engClass.addStudent(student1);
        engClass.addStudent(student2);
        engClass.addStudent(student3);

        engClass.listStudents();

        engClass.deleteStudent(2); // Deletes Hasnain Ali

        engClass.listStudents();
    }
}
