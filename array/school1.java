public class school1 {

    String name;
    String location;
    String principal;
    student []s;

    public school1(String name,String location,String principal,student[] s)
    {
        this.name=name;
        this.location=location;
        this.principal=principal;
        this.s=s;
    }

    public void detailsofschool1()
    {
        System.out.println("name:"+name);
        System.out.println("location:"+location);
        System.out.println("principal:"+principal);
    }

    public void totalstrength()
    {
        System.out.println("TOTAL LENGTH:"+s.length);
    }
    public void failed()
    {
        for(int i=1;i<3;i++)
        {
            if(s[i].marks<35)
            {
                System.out.println(s[i].sname+" is failed student");
            }
            /*else{
                System.out.println("pass");
            }*/
        }
    }
}
