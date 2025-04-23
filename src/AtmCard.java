import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AtmCard {
    public static void card(ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses, CourseMaintionPojo c, StudentPojo s, Scanner scanner)
    {
        long dep_num = 12345;
        int pinNUm = 2006;
        long balance = 100000;
        Random random = new Random();
        System.out.println("Enter your debit card number :");
        int dip= scanner.nextInt();
        if(dep_num==dip) {
            System.out.println("Enter your pin number :");
            int pin = scanner.nextInt();
            if (pin == pinNUm) {
                if (c.getFees() < balance) {
                    balance -= c.getFees();
                    int randomnumber = random.nextInt(1, 10);
                    studentCouurseMaintions.add(new StudentCouurseMaintion(c.getCourseName(), c.getCourseDuration(), c.getFees(), randomnumber));
                    adminMaintainStudentCourses.add(new Admin_Maintain_studentCourse(s.getStudentName(), s.getAge(), s.getDegree(), s.getDob(), s.getGender(), s.getMailId(), s.getMobileNumber(), c.getCourseName(), c.getCourseDuration(), c.getFees(), randomnumber, 0, "Not_Completed"));
                    System.out.println("Successfully enroll the courses");
                    System.out.println();
                    System.out.println("Your course token ID :" + randomnumber);
                    return;
                } else {
                    System.out.println(balance + "only you have ");
                }

            }
                System.out.println("Wrong pin number");

        }


    }
}
