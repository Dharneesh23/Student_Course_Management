import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdminOption implements AdminActionInterface {
    @Override
    public void adminLogin(Scanner scanner, ArrayList<AdminPojo>adminPojoArrayList, ArrayList<CourseMaintionPojo>courseadded, ArrayList<StudentPojo>studentPojos, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses)
    {
        System.out.println("Enter the Admin Id :");
        String adminId = scanner.next();
        for(AdminPojo arraylist_ID : adminPojoArrayList)
        {
            if(adminId.equals(arraylist_ID.getId()))
            {
                System.out.println("Enter the Admin Password :");
                String adminPass = scanner.next();
                if(adminPass.equals(arraylist_ID.getPass()))
                {
                    System.out.println("Successfully Login");
                    adminOption(scanner,courseadded,studentPojos,studentCouurseMaintions,adminMaintainStudentCourses);
                }else {
                    System.out.println("Wrong password!!!!");
                }
            }else{
                System.out.println("Wrong ID!!!!");
            }
            break;
        }

    }
    @Override
    public void adminOption(Scanner scanner, ArrayList<CourseMaintionPojo>courseadded, ArrayList<StudentPojo>studentPojos, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses) {
        while (true) {
            System.out.println("              DASHBOARD");

            System.out.println("1.Add Course");
            System.out.println("2.View Course");
            System.out.println("3.View Students");
            System.out.println("4.View Enroll Course Students");
            System.out.println("5.Exit");
            System.out.println();
            System.out.println("Enter your choice :");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    addCourse(courseadded,scanner);
                    break;
                case 2:
                    viewCourse(courseadded);
                    break;
                case 3:
                    viewStudents(studentPojos);
                    break;
                case 4:
                    enrollStudentdetails(adminMaintainStudentCourses);
                    break;
                case 5:
                    System.out.println("Exiting...");
                       return;

            }
        }
    }
    @Override
    public  void addCourse(ArrayList<CourseMaintionPojo>courseadd, Scanner scanner)
    {
        scanner.nextLine();
        System.out.println("Enter the course name to added :");
        String addedcourse = scanner.nextLine();
        System.out.println("Enter the duration :");
        String duration = scanner.nextLine();
        System.out.println("Enter the fees of the course ");
        long fees = scanner.nextLong();
       courseadd.add(new CourseMaintionPojo(addedcourse,duration,fees));
        System.out.println("Course added Successfully");
    }
    @Override
    public  void viewCourse(ArrayList<CourseMaintionPojo>addedcourse)
    {
        int i=1;
        for(CourseMaintionPojo viewCourse : addedcourse)
        {
            System.out.println(i+" "+viewCourse);
            i++;
        }
    }

private static void viewStudents(ArrayList<StudentPojo>studentPojos)
{
    for(StudentPojo viewStudent : studentPojos)
    {
        System.out.println(viewStudent);
    }
}
private static void enrollStudentdetails(ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses)
{
 for(Admin_Maintain_studentCourse a : adminMaintainStudentCourses)
 {
     System.out.println(a);
 }
}
public static void addQuestions(Scanner scanner,Admin_Maintain_studentCourse a,int mark)
{
            switch (a.getCourseName()) {
                case "Java": {
                    System.out.println("1. Who invented Java Programming?\n" +
                            "a) Guido van Rossum\n" +
                            "b) James Gosling\n" +
                            "c) Dennis Ritchie\n" +
                            "d) Bjarne Stroustrup");
                    String fAns = scanner.next();
                    if ("b".equals(fAns)) {
                        System.out.println("Correct");
                        mark++;
                    } else {
                        System.out.println("Wrong");
                    }
                    System.out.println("2. Which statement is true about Java?\n" +
                            "a) Java is a sequence-dependent programming language\n" +
                            "b) Java is a code dependent programming language\n" +
                            "c) Java is a platform-dependent programming language\n" +
                            "d) Java is a platform-independent programming language");
                    String sAns = scanner.next();
                    if ("d".equals(sAns)) {
                        mark++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                    System.out.println("3. Which component is used to compile, debug and execute the java programs?\n" +
                            "a) JRE\n" +
                            "b) JIT\n" +
                            "c) JDK\n" +
                            "d) JVM");
                    String tAns = scanner.next();
                    if ("c".equals(tAns)) {
                        mark++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Wrong");
                    }
                    if(mark>=2)
                    {
                        System.out.println("Congratulations you got a Certificate");
                        Random random = new Random();
                        int cerficateNumber =  random.nextInt(10,20);
                        System.out.println("Certificate token id :"+cerficateNumber);
                        CertificateGenerate.certificate(a,cerficateNumber,scanner);
                        a.setCerficateNo(cerficateNumber);
                        a.setcComplete("Completed the Course");

                    }else{
                        System.out.println("Try again!!!!");
                    }
                }

            }
        }
}




