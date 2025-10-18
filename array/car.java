public class car {
    String name;
    double price;
    static String owner="Aravind";

    enginecar e;

    car(String name,double price,enginecar e)
    {
        this.name=name;
        this.price=price;
        this.e=e;
    }

    public void detailsofcar()
    {
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("owner:"+owner);
    }

    
}
