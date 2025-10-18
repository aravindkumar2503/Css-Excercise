public class bank {
    private String b_name;
    private String branch;
    
    private bank(String b_name,String branch)
    {
        this.b_name=b_name;
        this.branch=branch;
    }

    public String getb_name()
    {
        return b_name;
    }
    public String getbranch()
    {
        return branch;
    }

    public static bank getbank(String b_name,String branch)
    {
        return new bank(b_name,branch);
    }
    
}
