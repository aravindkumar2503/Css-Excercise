public class sim {
    private String operator_name,band_width;
    private double price;
    //private mobile_no[10]={2,3,4,5,6,7,7,5,7,2};

    //constr
    private sim(String operator_name,String band_width,double price)
    {
        this.operator_name=operator_name;
        this.band_width=band_width;
        this.price=price;
    }

    //getter
    public String getoperator_name()
    {
        return operator_name;
    }
    public String getband_width()
    {
        return band_width;
    }

    public static sim getsim(String operator_name,String band_width,double price)
    {
        return new sim(operator_name,band_width,price);
    }
    public void detailsofsim()
    {
        System.out.println("operator_name:"+operator_name);
        System.out.println("band_width"+band_width);
        System.out.println("price:"+price);
    }
    
}
