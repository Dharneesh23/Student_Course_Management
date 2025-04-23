public class CourseMaintionPojo {
   private String courseName;
   private String courseDuration;
   private long fees;
   private int token;
   public CourseMaintionPojo(String courseName, String courseDuration, long fees)
   {
       this.courseName = courseName;
       this.courseDuration = courseDuration;
       this.fees = fees;
   }
    public CourseMaintionPojo(String courseName, String courseDuration, long fees, int token)
    {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.fees = fees;
        this.token = token;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public long getFees() {
        return fees;
    }
    public String toString()
    {
        return "COURSE_NAME :"+getCourseName()+"\n"+"COURSE_DURATION :"+getCourseDuration()+"\n"+"COURSE_FEES :"+getFees()+"\n"+"---------------------------------------------------------------";
    }

    public int getToken() {
        return token;
    }

}
