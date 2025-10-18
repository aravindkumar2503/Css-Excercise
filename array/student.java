public class student {
    String sname;
    int id;
    double marks;
    public student(String sname,int id,double marks)
    {
        this.sname=sname;
        this.id=id;
        this.marks=marks;
    }
    public String getname()
    {
        return sname;
    }

    public void detailsofstudent()
    {
        System.out.println("sname:"+sname);
        System.out.println("id:"+id);
        System.out.println("marks:"+marks);
    }
    
}
