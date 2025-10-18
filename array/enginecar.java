public class enginecar {
    String type;
    String cc;
    int power;

    enginecar(String type,String cc,int power)
    {
        this.type=type;
        this.cc=cc;
        this.power=power;
    }

    public void detailsofengine()
    {
        System.out.println("Type:"+type);
        System.out.println("cc:"+cc);
        System.out.println("power:"+power);
        System.out.println("*******************");

    }

    
}
