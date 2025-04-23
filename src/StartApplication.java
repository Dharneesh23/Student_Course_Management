
import java.util.ArrayList;
import java.util.Scanner;

public class StartApplication implements StartActionInterface{
    Scanner scanner = new Scanner(System.in);
    ArrayList<AdminPojo>adminPojoArrayList = new ArrayList<>();
    ArrayList<CourseMaintionPojo>courseadded = new ArrayList<>();
    ArrayList<StudentPojo>studentPojos = new ArrayList<>();
    ArrayList<StudentCouurseMaintion>studentCouurseMaintions = new ArrayList<>();
    ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses = new ArrayList<>();
    @Override
    public void applicationOptions() {
        adminPojoArrayList.add(new AdminPojo("123","123"));
        System.out.println("Welcome to Success yor life Academy");
        System.out.println("---------------------------------------");
        while (true) {
            System.out.println("1.Admin Login");
            System.out.println("2.Student Login");
            System.out.println("3.Exit");

            System.out.println("Enter your choice :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AdminOption adminOption = new AdminOption();
                    adminOption.adminLogin(scanner,adminPojoArrayList,courseadded,studentPojos,studentCouurseMaintions,adminMaintainStudentCourses);
                    break;
                case 2:
                    StudentOption.studentLogin(scanner,studentPojos,courseadded,studentCouurseMaintions,adminMaintainStudentCourses);
                    break;
                case 3:
                    System.out.println("Exiting......");
                    return;
            }
            System.out.println("--------------------------------------");
        }
    }
}
