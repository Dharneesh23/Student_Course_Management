import java.util.ArrayList;
import java.util.Scanner;

public class StudentOption implements StudentActionInterface {
 public static void studentLogin(Scanner scanner, ArrayList<StudentPojo>studentPojos, ArrayList<CourseMaintionPojo>courseMaintions, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses) {
     while (true) {
         System.out.println("1.Register");
         System.out.println("2.Sign-in");
         System.out.println("3.Exit");
         System.out.println();
         System.out.println("Enter your choice :");
         int choice = scanner.nextInt();
         StudentOption studentOption = new StudentOption();
         switch (choice) {

             case 1:
                 studentOption.addStudent(scanner, studentPojos);
                 break;
             case 2:
                studentOption.studentSigin(scanner, studentPojos,courseMaintions,studentCouurseMaintions,adminMaintainStudentCourses);
                 break;
             case 3:
                 return;
         }
     }
 }
 @Override
 public void studentSigin(Scanner scanner, ArrayList<StudentPojo>studentPojos, ArrayList<CourseMaintionPojo>courseMaintions, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses) {
     System.out.println("Enter your ID :");
     String studentID = scanner.next();
     boolean b = false;
     for (StudentPojo st : studentPojos) {
         if (studentID.equals(st.getStudentId()))
         {
             b = true;
             System.out.println("Enter your Password :");
             String studentPass = scanner.next();
             if(studentPass.equals(st.getStudentPassword())) {
                 System.out.println("Successfully Login!!!");
                 while (true) {
                     {
                         System.out.println("1.View available course");
                         System.out.println("2.Enroll the course");
                         System.out.println("3.view enroll course");
                         System.out.println("4.Certification Test");
                         System.out.println("5.View Certificate");
                         System.out.println("6.Exit");
                         System.out.println();
                         System.out.println("Enter your choice :");
                         int choice = scanner.nextInt();
                         switch (choice)
                         {
                             case 1:
                                 viewCourse(courseMaintions);
                                 break;
                             case 2:
                                 enrollCourse(courseMaintions,scanner,studentCouurseMaintions,studentPojos,adminMaintainStudentCourses);
                                 break;
                             case 3:
                                 viewEnrollCourse(studentCouurseMaintions);
                                 break;
                             case 4:
                                 Certifaction_test(scanner,adminMaintainStudentCourses);
                                 break;
                             case 5:
                                 viewCertifaction(adminMaintainStudentCourses,scanner);
                                 break;
                             case 6:
                                 return;
                         }
                     }
                 }
             }else{
                 System.out.println("Wrong pass !!!");
             }
         }
     }

 }
 @Override
    public  void viewCourse(ArrayList<CourseMaintionPojo>addedcourse)
    {
        int i=1;
        for(CourseMaintionPojo viewCourse : addedcourse)
        {
            System.out.println(i+" "+viewCourse);
            i++;
            return;
        }
        System.out.println("Not Found !!!");
    }
    @Override
    public void enrollCourse(ArrayList<CourseMaintionPojo>courseMaintions, Scanner scanner, ArrayList<StudentCouurseMaintion>studentCouurseMaintions, ArrayList<StudentPojo>studentPojos, ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses)
    {
        System.out.println("Enter your student id :");
        String stId = scanner.next();
        for(StudentPojo s : studentPojos)
        {
            if(s.getStudentId().equals(stId))
            {
                System.out.println("Enter the student password:");
                String pass = scanner.next();
                if(s.getStudentPassword().equals(pass))
                {
                    scanner.nextLine();
                    System.out.println("Enter the course name :");
                    String courseName = scanner.nextLine();
                    for(CourseMaintionPojo c : courseMaintions)
                    {
                        if(c.getCourseName().equals(courseName)) {
                            System.out.println(c);
                            System.out.println();
                            System.out.println("Conform to enroll the course pay the amount ");
                            System.out.println("Amount :" + c.getFees());
                            GpayScanner.gpay(scanner, studentCouurseMaintions, c, s, adminMaintainStudentCourses);
                        }
                    }
                }
                    System.out.println("Course not found !!!!");
                    break;


        }
        }



    }
    @Override
    public void viewEnrollCourse(ArrayList<StudentCouurseMaintion>studentCouurseMaintions)
    {
        for(StudentCouurseMaintion studentCouurseMaintion : studentCouurseMaintions)
        {
            System.out.println(studentCouurseMaintion);
            return;
        }

        System.out.println("Not Found!!!!");
    }
    public  void Certifaction_test(Scanner scanner,ArrayList<Admin_Maintain_studentCourse>adminMaintainStudentCourses)
    {
        int StudentMark =0;
        for(Admin_Maintain_studentCourse admi : adminMaintainStudentCourses)
        {
            if(admi.getCerficateNo()!=0) {
                System.out.println("Already you will complete your Test!!!");
                System.out.println("Your certificate No :"+admi.getCerficateNo());
            }else {
                System.out.println("Enter your course token Id :");
                int id = scanner.nextInt();
                if (admi.getToken() == id) {
                    AdminOption.addQuestions(scanner, admi, StudentMark);
                }
            }
        }
        }

@Override
    public  void viewCertifaction(ArrayList<Admin_Maintain_studentCourse>a,Scanner scanner)
    {
        System.out.println("Enter your token :");
        int gToken = scanner.nextInt();
        for(Admin_Maintain_studentCourse e : a)
        {
            if(e.getToken()==gToken)
            {
                CertificateGenerate.certificate(e,e.getCerficateNo(),scanner);
            }else {
                System.out.println("Token not found!!!");
            }
        }
    }
    @Override
    public void addStudent(Scanner scanner,ArrayList<StudentPojo>studentPojos)
    {
        scanner.nextLine();
        System.out.println("Enter your name :");
        String studentName = scanner.next();
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the stream of degree");
        String degree = scanner.nextLine();
        System.out.println("Enter your Birth Date eg(dd/mm/yy)");
        String date = scanner.next();
        System.out.println("Enter the Gender eg(Male / Female)");
        String gender = scanner.next();
        System.out.println("Enter your Mail_ID:");
        String mailId = scanner.next();
        System.out.println("Enter your mobile number :");
        long mobileNumber = scanner.nextLong();

        System.out.println("Thank you for giving a basic details ");
        System.out.println("--------------------------------");
        System.out.println("Create your ID :");
        String stId = scanner.next();
        System.out.println("Create your password");
        String stpass = scanner.next();
        if(!studentPojos.isEmpty()) {
            for (StudentPojo s : studentPojos) {
                if (stId.equals(s.getStudentId()) && stpass.equals(s.getStudentPassword())) {
                    System.out.println("Student already exits");
                    return;
                }
            }
        }

        studentPojos.add(new StudentPojo(studentName, age, degree, date, gender, mailId, mobileNumber, stId, stpass));
        System.out.println("Successfully Register!!!!!");
    }
}
