import java.util.Scanner;

public class CertificateGenerate {
    public static void certificate(Admin_Maintain_studentCourse a, int number, Scanner scanner)
    {
        System.out.println("Enter your certificate number");
        int cNum = scanner.nextInt();
        if(cNum==number) {
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("------" + a.getStudentName() + "-------------");
            System.out.println("----------------------------------");
            System.out.println("--------" + a.getCourseName() + "----------");
            System.out.println("---------Course Completed ----------");
            System.out.println("----------------------------------");
        }
    }
}
