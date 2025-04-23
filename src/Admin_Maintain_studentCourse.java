public class Admin_Maintain_studentCourse {
    private String studentName;
    private int age;
    private String degree;
    private String dob;
    private String gender;
    private String mailId;
    private long mobileNumber;
    private String courseName;
    private String duration;
    private long fees;
    private int tokenId ;
    private int cerficateNo;
    private String cComplete;
    public Admin_Maintain_studentCourse(String studentName,int age,String degree,String dob,String gender,String mailId,long mobileNumber,String courseName,String duration,long fees,int token,int cerficateNo,String cComplete)
    {
        this.studentName = studentName;
        this.age = age;
        this.degree = degree;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNumber = mobileNumber;
        this.courseName = courseName;
        this.fees =fees;
        this.duration = duration;
        this.tokenId = token;
        this.cerficateNo = cerficateNo;
        this.cComplete = cComplete;
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

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }

    public long getFees() {
        return fees;
    }
    public String toString()
    {
        return "\t\t\t\tSTUDENT DETAILS\n"+"STUDENT_NAME :"+getStudentName()+"\n"+"AGE :"+getAge()+"\n"+"STUDYING_DEGREE :"+getDegree()+"\n"+"DATE_OF_BIRTH :"+getDob()+"\n"+"GENDER :"+getGender()+"\n"+"MAIL_ID :"+getMailId()+"\n"+"MOBILE_NUMBER :"+getMobileNumber()+"\n"+"\t\t\t STUDENT COURSE ENROLL DETAIL\n"+"COURSE_NAME :"+getCourseName()+"\n"+"COURSE_DURATION :"+getDuration()+"\n"+"COURSE_FEES :"+getFees()+"\nTokenID :"+getToken()+"\n"+"COURSE_STATUS :"+getcComplete()+"----------------------------------------------------------------";
    }

    public int getToken() {
        return tokenId;
    }

    public int getCerficateNo() {
        return cerficateNo;
    }

    public void setCerficateNo(int cerficateNo) {
        this.cerficateNo = cerficateNo;
    }

    public String getcComplete() {
        return cComplete;
    }

    public void setcComplete(String cComplete) {
        this.cComplete = cComplete;
    }
}
