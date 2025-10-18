public class singleton {
    private static singleton database;
    private String user;
    private String os;

    private singleton(String user,String os)
    {
        this.user=user;
        this.os=os;
    }

    public String getuser()
    {
        return user;
    }
    public String getos()
    {
        return os;
    }
    public static singleton getdatabase(String user,String os)
    {
        if(database==null)
        {
            database=new singleton(user, os);
        }
        return database;
    }
    
}
