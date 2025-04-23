public class StudentPojo {
    private String studentName;
    private int age;
    private String degree;
    private String dob;
    private String gender;
    private String mailId;
    private long mobileNumber;
    private String studentId;
    private String studentPassword;
    public StudentPojo(String studentName,int age,String degree,String dob,String gender,String mailId,long mobileNumber,String studentId,String studentPassword)
    {
        this.studentName = studentName;
        this.age = age;
        this.degree = degree;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNumber = mobileNumber;
        this.studentId = studentId;
        this.studentPassword = studentPassword;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getDegree() {
        return degree;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getMailId() {
        return mailId;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

   public String toString()
   {
       return "STUDENT_NAME :"+getStudentName()+"\n"+"AGE :"+getAge()+"\n"+"STUDYING_DEGREE :"+getDegree()+"\n"+"DATE_OF_BIRTH :"+getDob()+"\n"+"GENDER :"+getGender()+"\n"+"MAIL_ID :"+getMailId()+"\n"+"MOBILE_NUMBER :"+getMobileNumber()+"\n"+"STUDENT_ID :"+getStudentId()+"\n"+"STUDENT_PASSWORD :"+getStudentPassword()+"\n"+"----------------------------------------------------------------";
   }
}
