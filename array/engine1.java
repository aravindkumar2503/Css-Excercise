public class engine1 {

    private String type;
    private int cc ;
    private String power;

    engine1(String type,int cc,String power)
    {
        this.type=type;
        this.cc=cc;
        this.power=power;

    }
    
    public void detailsofengine1()
    {
        System.out.println("type:"+type);
        System.out.println("cc:"+cc);
        System.out.println("power:"+power);
    }
    
}
