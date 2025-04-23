import java.util.ArrayList;
import java.util.Scanner;

public interface StudentActionInterface {
    void addStudent(Scanner scanner, ArrayList<StudentPojo> studentPojos);
    void studentSigin(Scanner scanner, ArrayList<StudentPojo>studentPojos, ArrayList<CourseMaintionPojo>courseMaintions, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses);
    void viewCourse(ArrayList<CourseMaintionPojo>addedcourse);
    void enrollCourse(ArrayList<CourseMaintionPojo>courseMaintions, Scanner scanner, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<StudentPojo>studentPojos, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses);
    void viewEnrollCourse(ArrayList<StudentCouurseMaintion>studentCouurseMaintions);
    void Certifaction_test(Scanner scanner,ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses);
    void viewCertifaction(ArrayList<Admin_Maintain_studentCourse>a,Scanner scanner);

}

