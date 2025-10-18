import java.util.Arrays;

public class mobile {

    String name,storage;
    double price;
    sim s;

    public mobile(String name,String storage,double price)
    {
        this.name=name;
        this.storage=storage;
        this.price=price;
    }

    public boolean isslotempty()
    {
        return s==null;
    }

    public void insertsim(sim Sim)
    {
        if(isslotempty())
        {
            s=Sim;
            System.out.println("sim inserted");
        }
        else{
            System.out.println("Already is present");
        }
    }
    public void removesim()
    {
        if(isslotempty())
        {
            System.out.println("Already is removed");
        }
        else{
            s=null;
            System.out.println("sim has been removed");
        }
    }
    public void mobile_no()
    {
        int mobileno[]={2,2,5,6,8,6,7,8,6,2};
        System.out.println("MOBILE NUMBER:"+Arrays.toString(mobileno));
    }
    public void detailsofmobile()
    {
        System.out.println("name:"+name);
        System.out.println("storage:"+storage);
        System.out.println("price:"+price);
        //System.out.println("mobile number:"+Arrays.toString(mobile_no()));
    }

    
}
