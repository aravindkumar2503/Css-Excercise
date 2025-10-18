public class bag {

    ball b1;//ball-->class name,b1--->instance variable(object reference)

    public bag() {
    }

    public boolean isbagempty()
    {
        return b1==null;
    }

    public void addball(ball BALL)//(ball object passed --->BALL is variable name)
    {
        if(isbagempty())
        {
            b1=BALL;
        }
        else{
            System.out.println("***********Already ball is there*************");
        }
    }

    public void removebag()
    {
        if(isbagempty())
        {
            System.out.println("\t\t********Already ball is removed**********");
        }
        else{
            b1=null;
            System.out.println("\t\t********ball is removed**************");
        }
    }

    public String showgame()
    {
        if(b1 instanceof basketball)
        {
            return "basketball";
            //System.out.println("game="+b1);
        }
        else if(b1 instanceof tennisball)
        {
            //System.out.println("game="+b1);
            return "tennisball";
        }
        else
        {
            return "no ball pls add ball";
        }
    }
    
}
