class oops
{
    private String name;
    private String mobile;
    private int pwd;

    public oops(String name,String mobile,int pwd)
    {
        this.name=name;
        this.mobile=mobile;
        this.pwd=pwd;
    }

    public String getname()
    {
        return name;
    }
    public String getmobile()
    {
        return mobile;
    }
    public int getpwd()
    {
        return pwd;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setmobile(String mobile)
    {
        this.mobile=mobile;
    }
    public void setpwd(int pwd)
    {
        this.pwd=pwd;
    }
}