import java.util.ArrayList;
import java.util.Scanner;

public interface AdminActionInterface {
    void adminLogin(Scanner scanner, ArrayList<AdminPojo> adminPojoArrayList, ArrayList<CourseMaintionPojo>courseadded, ArrayList<StudentPojo>studentPojos, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses);
    void adminOption(Scanner scanner, ArrayList<CourseMaintionPojo>courseadded, ArrayList<StudentPojo>studentPojos, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses);
    void addCourse(ArrayList<CourseMaintionPojo>courseadd, Scanner scanner);
    void viewCourse(ArrayList<CourseMaintionPojo>addedcourse);

}
