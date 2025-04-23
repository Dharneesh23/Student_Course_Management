public class StudentCouurseMaintion extends CourseMaintionPojo {

    public StudentCouurseMaintion(String courseName, String courseDuration, long fees,int random) {
        super(courseName, courseDuration, fees,random);
    }



    public String toString()
    {
        return "COURSE NAME :"+getCourseName()+"\n"+"COURSE DURATION :"+getCourseDuration()+"\n"+"FEES :"+getFees()+" PAID\n"+"Course TokenId :"+getToken();
    }
}
