public class AdminPojo {
    private String id;
    private String pass;
    public AdminPojo(String id , String pass)
    {
        this.id = id;
        this.pass = pass;
    }
    public String getId()
    {
        return id;
    }
    public String getPass()
    {
        return pass;
    }
}
