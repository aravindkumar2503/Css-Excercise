public class early_instantiation {

    private String name;
    private double price;
    engine e=new engine();
    public early_instantiation(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    
    public void detailsofcar()
    {
        System.out.println("name:"+name);
        System.out.println("price:"+price);
    }

    
}
