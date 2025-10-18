public class vehicle {
    private String name;
    private double price;
    private String colour;

    engine1 e=new engine1();
    
    public vehicle(String name,double price,String colour)
    {
        this.name=name;
        this.price=price;
        this.colour=colour;
    }

    public void detailsofvehicle()
    {
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("cplour:"+colour);
    }
    
}
