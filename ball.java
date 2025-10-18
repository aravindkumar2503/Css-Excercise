public class ball {
    private int radius;

    ball(){}
    ball(int radius)
    {
        this.radius=radius;
    }

    public int getball()
    {
        return radius;
    }

    public void setball(int radius)
    {
        this.radius=radius;
    }

    
}
class basketball extends ball
{
    String game="Basketball";
    basketball()
    {
        super(5);
    }
}
class tennisball extends ball{
    String game="tennisball";
    tennisball()
    {
        super(10);
    }
}
