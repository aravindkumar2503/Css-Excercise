public class private_constructor {
    private String name;
    private double price;

    private private_constructor(String name,double price)
    {
        this.name=name;
        this.price=price;
    }

    public String getname()
    {
        return name;
    }
    public double getprice()
    {
        return price;
    }

    public static private_constructor getprod(String name,double price)
    {
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("********************");
        return new private_constructor(name, price);
    }
    
}
