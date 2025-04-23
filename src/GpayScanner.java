import java.util.ArrayList;
import java.util.Scanner;

public class GpayScanner {
    public static void gpay(Scanner scanner, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, CourseMaintionPojo c, StudentPojo s, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses)
    {
        System.out.println("********");
        System.out.println();
        System.out.println("Do you pay the amount press 1 to enroll otherwise press 2 to exit");
        System.out.println();
        int x = scanner.nextInt();
        switch (x)
        {
            case 1:
                AtmCard.card(studentCouurseMaintions,adminMaintainStudentCourses, c,s,scanner);
                return;
            case 2:
                return;
        }
    }

}
