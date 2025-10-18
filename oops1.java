public class oops1 {
        private String name;
        private double price;

    private oops1(String name,double price)
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
    public static oops1 getoops1(String name,double price)
    {
        return new oops1(name,price);
    }
}
